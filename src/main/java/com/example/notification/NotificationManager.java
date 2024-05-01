package com.example.notification;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationManager {
    private final List<NotificationService> notificationServices;

    public NotificationManager(List<NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }


    public void sendNotification(NotificationRequest notificationRequest) {
        for (NotificationService notificationService : notificationServices) {
            if (notificationService.support(notificationRequest.type())) {
                notificationService.sendNotification(notificationRequest);
            }
        }
    }
}
