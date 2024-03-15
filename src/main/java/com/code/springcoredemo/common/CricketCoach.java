package com.code.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define  init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("In doMyStartUpStuff(): " + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff(): " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
