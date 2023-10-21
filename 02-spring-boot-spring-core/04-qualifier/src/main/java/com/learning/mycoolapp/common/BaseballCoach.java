package com.learning.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "BASEBALL";
    }
}
