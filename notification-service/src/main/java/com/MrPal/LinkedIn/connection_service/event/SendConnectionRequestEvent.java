package com.MrPal.LinkedIn.connection_service.event;

import lombok.Data;

@Data
public class SendConnectionRequestEvent {
    private Long senderId;
    private Long receiverId;

    @Data
    public static class AcceptConnectionRequestEvent {
        private Long senderId;
        private Long receiverId;
    }
}
