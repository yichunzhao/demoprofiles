package com.ynz.demoprofiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ynz.demoprofiles.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ProfilesDemoApplication {

    public static void main(String[] args) throws JsonProcessingException {
        ConfigurableApplicationContext context = SpringApplication.run(ProfilesDemoApplication.class, args);

        Greeting greeting = context.getBean(Greeting.class);
        greeting.sayHello();

    }

}
