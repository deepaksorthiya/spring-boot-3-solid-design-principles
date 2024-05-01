package com.example.notification.email;

import com.example.notification.NotificationRequest;
import com.example.notification.NotificationService;
import com.example.notification.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        System.out.println("Email Notification Sent" + notificationRequest);
    }

    @Override
    public boolean support(NotificationType notificationType) {
        return NotificationType.EMAIL.equals(notificationType);
    }
}

