
package com.example.notification_service.controller;

import com.example.notification_service.model.Notification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping
    public Notification sendNotification(@RequestBody Notification notification) {
        return new Notification(
                "N501",
                notification.getRecipientId(),
                "SMS",
                "SENT"
        );
    }

    @GetMapping("/{notificationId}")
    public Notification getNotification(@PathVariable String notificationId) {
        return new Notification(
                notificationId,
                "C1001",
                "SMS",
                "SENT"
        );
    }
}