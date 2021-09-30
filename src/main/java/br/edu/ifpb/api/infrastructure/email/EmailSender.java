package br.edu.ifpb.api.infrastructure.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String email, String body, String subject) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);
        msg.setFrom("xogido1425@ergowiki.com");
        msg.setSubject(subject);
        msg.setText(body);

        javaMailSender.send(msg);
    }
    
}
