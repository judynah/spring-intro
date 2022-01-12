package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);

        MessageService randomMessageService = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(randomMessageService.hashCode());

        applicationContext.close();
    }
}
