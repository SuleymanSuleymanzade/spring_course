package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("catBean")
@Primary
public class Cat implements Pet{
    public void say(){
        System.out.println("Mew Mew");
    }

}
