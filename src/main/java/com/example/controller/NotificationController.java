package com.example.controller;

import com.example.notification.NotificationManager;
import com.example.notification.NotificationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private final NotificationManager notificationManager;

    public NotificationController(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest request) {
        notificationManager.sendNotification(request);
        return ResponseEntity.ok("Notification sent successfully");
    }
}
