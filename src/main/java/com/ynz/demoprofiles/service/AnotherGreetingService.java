package com.ynz.demoprofiles.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
@Slf4j
public class AnotherGreetingService implements Greeting {
    @Value("${app.greeting}")
    private String profile;

    public void sayHello(){
        log.info(profile);
    }
}
