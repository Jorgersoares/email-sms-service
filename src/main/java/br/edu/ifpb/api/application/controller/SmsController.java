package br.edu.ifpb.api.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.api.application.service.SmsNotificationService;
import br.edu.ifpb.api.presentation.dto.SmsRequest;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SmsController {

    @Autowired
    SmsNotificationService smsNotificationService;
    
    @PostMapping
    public ResponseEntity sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        smsNotificationService.send(smsRequest.getPhone(), smsRequest.getBody());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}