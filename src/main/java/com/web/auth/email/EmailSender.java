package com.web.auth.email;

public interface EmailSender {
    void send(String to, String email);
}
