package br.edu.ifpb.api.infrastructure.client;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.stereotype.Component;

@Component
public class TwilioClient {

    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";

    public void login() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public Message sendSms(String phone, String body) {
        PhoneNumber fromPhone = new PhoneNumber("");
        PhoneNumber toPhone = new PhoneNumber("".concat(phone));
        return Message.creator(toPhone, fromPhone, body).create();
    }
    
}
