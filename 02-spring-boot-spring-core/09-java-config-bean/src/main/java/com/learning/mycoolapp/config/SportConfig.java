package com.learning.mycoolapp.config;

import com.learning.mycoolapp.common.Coach;
import com.learning.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("sea")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
