package com.marxborges.chat_api.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String chat(String message) {
        return "Você enviou: " + message;
    }
}
