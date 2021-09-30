package br.edu.ifpb.api.presentation.dto;

import java.io.Serializable;

public class EmailRequest implements Serializable{
    
    private String email;
    private String message;
    private String subject;


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    
}
