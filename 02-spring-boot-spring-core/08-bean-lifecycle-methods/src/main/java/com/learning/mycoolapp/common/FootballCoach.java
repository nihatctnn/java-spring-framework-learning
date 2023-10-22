package com.learning.mycoolapp.common;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "FOOTBALL";
    }
}
