package com.example.notification.push;

import com.example.notification.NotificationRequest;
import com.example.notification.NotificationService;
import com.example.notification.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        System.out.println("Push Notification Sent" + notificationRequest);
    }

    @Override
    public boolean support(NotificationType notificationType) {
        return NotificationType.PUSH.equals(notificationType);
    }
}

