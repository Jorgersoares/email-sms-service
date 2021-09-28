package br.edu.ifpb.api.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.api.domain.service.NotificationService;
import br.edu.ifpb.api.infrastructure.client.TwilioClient;

@Service
public class SmsNotificationService implements NotificationService {

    @Autowired
    TwilioClient smsClient;

    @Override
    public void send(String target, String body) {
        smsClient.login();
        smsClient.sendSms(target, body);
    }
    
}
