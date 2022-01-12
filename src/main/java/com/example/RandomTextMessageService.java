package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{

    String[] messageList = new String[]{"styczen", "luty", "marzec", "kwiecein", "maj", "czerwiec", "lipiec", "sierpien", "wrzesien", "pazdziernik"};


    public String getMessage(){
        Random random = new Random();
        String randomMessage = this.messageList[random.nextInt(messageList.length-1)];
        return randomMessage;
    }
}
