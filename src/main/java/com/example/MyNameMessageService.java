package com.example;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {

    public String name;

    public MyNameMessageService(){
        this.name = "Natalia Nahlik";
    }


    public String getMessage(){
        return "Natalia Nahlik";
    }

}
