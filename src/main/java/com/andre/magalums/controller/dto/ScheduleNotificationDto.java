package com.andre.magalums.controller.dto;

import com.andre.magalums.entity.Channel;
import com.andre.magalums.entity.Notification;
import com.andre.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(dateTime, destination, message, channel.toChannel(), Status.Values.PENDING.toStatus());
    }
}
