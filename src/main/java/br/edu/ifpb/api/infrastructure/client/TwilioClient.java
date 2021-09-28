package br.edu.ifpb.api.infrastructure.client;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.springframework.stereotype.Component;

@Component
public class TwilioClient {

    public static final String ACCOUNT_SID = "ACa4e68433020cd358c0ba03f4c21a7dab";
    public static final String AUTH_TOKEN = "d1572a7d599c7cdf69f93a54bcd3b5aa";

    public void login() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public Message sendSms(String phone, String body) {
        PhoneNumber fromPhone = new PhoneNumber("+16176225843");
        PhoneNumber toPhone = new PhoneNumber("+55".concat(phone));
        return Message.creator(toPhone, fromPhone, body).create();
    }
    
}
