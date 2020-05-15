package com.ynz.demoprofiles.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@Slf4j
public class GreetingService implements Greeting {

    public void sayHello() {
        log.info("dev env. say hello ");
    }

}
