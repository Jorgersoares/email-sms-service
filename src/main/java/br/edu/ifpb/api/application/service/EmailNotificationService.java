package br.edu.ifpb.api.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.api.domain.service.NotificationService;
import br.edu.ifpb.api.infrastructure.email.EmailSender;

@Service
public class EmailNotificationService implements NotificationService {

    @Autowired
    EmailSender emailSender;


    @Override
    public void send(String email, String body, String subject) {
        this.emailSender.sendEmail(email, body, subject);
    }


    @Override
    public void send(String target, String body) { }
    
}
