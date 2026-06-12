package com.marxborges.chat_api.controller;

import com.marxborges.chat_api.dto.ChatRequest;
import com.marxborges.chat_api.dto.ChatResponse;
import com.marxborges.chat_api.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatResponse chat (
            @RequestBody ChatRequest request
    ) {
        String response = chatService.chat(request.message());

        return new ChatResponse(response);
    }
}
