
package com.example.notification_service.model;

public class Notification {
    private String notificationId;
    private String recipientId;
    private String channel;
    private String messageStatus;

    public Notification() {
    }

    public Notification(String notificationId, String recipientId, String channel, String messageStatus) {
        this.notificationId = notificationId;
        this.recipientId = recipientId;
        this.channel = channel;
        this.messageStatus = messageStatus;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
}