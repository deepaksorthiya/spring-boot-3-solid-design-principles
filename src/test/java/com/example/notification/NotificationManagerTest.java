package com.example.notification;

import com.example.notification.email.EmailNotificationService;
import com.example.notification.push.PushNotificationService;
import com.example.notification.sms.SmsNotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
class NotificationManagerTest {

    @Mock
    private EmailNotificationService emailNotificationService;

    @Mock
    private SmsNotificationService smsNotificationService;

    @Mock
    private PushNotificationService pushNotificationService;

    private NotificationManager notificationManager;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        notificationManager = new NotificationManager(List.of(emailNotificationService, smsNotificationService,
                pushNotificationService));
    }

    @Test
    public void testSendNotification_Email() {
        String message = "Test message";
        String recipient = "test@example.com";
        NotificationType type = NotificationType.EMAIL;

        NotificationRequest request = new NotificationRequest(message, recipient, type);
        when(emailNotificationService.support(type)).thenReturn(true);

        notificationManager.sendNotification(request);

        verify(emailNotificationService, times(1)).sendNotification(request);
    }

    @Test
    public void testSendNotification_SMS() {
        String message = "Test message";
        String recipient = "1234567890";
        NotificationType type = NotificationType.SMS;

        NotificationRequest request = new NotificationRequest(message, recipient, type);
        when(smsNotificationService.support(type)).thenReturn(true);

        notificationManager.sendNotification(request);

        verify(smsNotificationService, times(1)).sendNotification(request);
    }

    @Test
    public void testSendNotification_Push() {
        String message = "Test message";
        String recipient = "device_token";
        NotificationType type = NotificationType.PUSH;

        NotificationRequest request = new NotificationRequest(message, recipient, type);
        when(pushNotificationService.support(type)).thenReturn(true);

        notificationManager.sendNotification(request);

        verify(pushNotificationService, times(1)).sendNotification(request);
    }

    @Test
    public void testSendNotification_InvalidRequest() {
        String message = "Test message";
        String recipient = "invalid";

        NotificationRequest request = new NotificationRequest(message, recipient, null);

        assertThrows(IllegalArgumentException.class, () -> notificationManager.sendNotification(request));
    }
}

