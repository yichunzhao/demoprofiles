package com.ynz.demoprofiles.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Profile("json")
@Slf4j
public class ToJsonGreeting implements Greeting {
    //injecting the property spring.profiles.active
    @Value("${app.greeting}")
    private String greeting;

    private ObjectMapper objectMapper;

    @Autowired
    public ToJsonGreeting(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void sayHello() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("YYY", greeting);
        map.put("ZZZ", greeting);

        log.info(objectMapper.writeValueAsString(map));
    }
}
