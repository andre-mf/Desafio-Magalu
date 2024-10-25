package com.andre.magalums.service;

import com.andre.magalums.controller.dto.ScheduleNotificationDto;
import com.andre.magalums.entity.Notification;
import com.andre.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long id) {
        return notificationRepository.findById(id);
    }
}
