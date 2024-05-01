package com.example.notification.sms;

import com.example.notification.NotificationRequest;
import com.example.notification.NotificationService;
import com.example.notification.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        System.out.println("SMS Notification Sent" + notificationRequest);
    }

    @Override
    public boolean support(NotificationType notificationType) {
        return NotificationType.SMS.equals(notificationType);
    }
}
