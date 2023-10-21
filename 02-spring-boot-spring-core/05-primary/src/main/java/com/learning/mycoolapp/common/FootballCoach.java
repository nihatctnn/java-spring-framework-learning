package com.learning.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "FOOTBALL";
    }
}
