package br.edu.ifpb.api.infrastructure.queue.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ifpb.api.application.service.EmailNotificationService;
import br.edu.ifpb.api.presentation.dto.EmailRequest;

import org.springframework.messaging.handler.annotation.Payload;

@Component
public class QueueConsumer {

    @Autowired
    EmailNotificationService emailNotificationService;

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String fileBody) throws JsonProcessingException {
      EmailRequest emailRequest = new ObjectMapper().readValue(fileBody, EmailRequest.class);
      this.emailNotificationService.send(emailRequest.getEmail(), emailRequest.getMessage(), emailRequest.getSubject());
    }
    
}
