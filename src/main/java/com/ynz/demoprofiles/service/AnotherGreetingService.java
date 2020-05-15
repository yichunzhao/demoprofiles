package com.ynz.demoprofiles.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
@Slf4j
public class AnotherGreetingService implements Greeting {

    public void sayHello(){
        log.info("Non-dev Saying hello");
    }
}
