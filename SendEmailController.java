package com.example.SpringBootEmailSendingApplication.controller;

import com.example.SpringBootEmailSendingApplication.service.EmailSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class SendEmailController {
    @Autowired
    EmailSendingService emailSendingService;
    @GetMapping("/sendEmail")
    public void sendEmail() throws MessagingException, IOException {
        emailSendingService.sendEmail();

    }


}
