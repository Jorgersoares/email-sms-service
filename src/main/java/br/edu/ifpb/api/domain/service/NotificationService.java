package br.edu.ifpb.api.domain.service;

public interface NotificationService {
    
    void send(String target, String body);
}
