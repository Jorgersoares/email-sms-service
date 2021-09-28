package br.edu.ifpb.api.presentation.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class SmsRequest implements Serializable {

    @NotBlank
    public String phone;
    @NotBlank
    public String body;

    public String getPhone() {
        return this.phone;
    } 

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBody() {
        return this.body;
    } 

    public void setBody(String body) {
        this.body = body;
    }
    
}
