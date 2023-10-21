package com.learning.mycoolapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection

    public DemoController(Coach theCoach){
        this.myCoach = theCoach;
    }

    @GetMapping("/")
    public String situation(){
        return "Successful";
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}