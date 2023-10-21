package com.learning.mycoolapp.rest;
import com.learning.mycoolapp.common.Coach;
import com.learning.mycoolapp.common.FootballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public DemoController (Coach theCoach){
        myCoach = theCoach;
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