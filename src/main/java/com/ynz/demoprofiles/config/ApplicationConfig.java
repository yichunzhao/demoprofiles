package com.ynz.demoprofiles.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Random;

@Configuration
@Profile("dev")
public class ApplicationConfig {

    @Bean("random")
    public Double random() {
        return new Random().nextDouble();
    }


}
