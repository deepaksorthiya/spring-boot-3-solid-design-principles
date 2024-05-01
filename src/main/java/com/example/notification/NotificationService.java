package com.example.notification;

public interface NotificationService {
    void sendNotification(NotificationRequest notificationRequest);

    boolean support(NotificationType notificationType);
}