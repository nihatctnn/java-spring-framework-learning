package com.learning.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Deneme";
    }
}
