package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("personBean")
public class Person {
    private Pet pet;

    @Autowired
    public Person(Pet pet){
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("hello pet");
        this.pet.say();
    }
}
