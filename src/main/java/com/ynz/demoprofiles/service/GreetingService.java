package com.ynz.demoprofiles.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@Slf4j
public class GreetingService implements Greeting {
    @Value("${app.greeting}")
    private String greeting;

    @Autowired
    @Qualifier("random")
    private Double random;

    public void sayHello() {
        log.info(greeting);
        log.info("random :" + random);
    }

}
