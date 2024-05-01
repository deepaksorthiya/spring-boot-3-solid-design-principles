package com.example.notification;

public record NotificationRequest(String message, String recipient, NotificationType type) {
}