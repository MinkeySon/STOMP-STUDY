package org.handmk.websocketstudy.controller;

import org.handmk.websocketstudy.data.dto.request.RequestChatContentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


@Controller
public class ChatController {
    private final SimpMessagingTemplate template;
    @Autowired
    public ChatController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/test") // 메세지 전송
    public void sendMessage(RequestChatContentsDto message) throws Exception {
        Thread.sleep(1000); // simulated delay
        template.convertAndSend("/sub", message); // 구독한 채팅방으로 메세지 전송
    }
}
