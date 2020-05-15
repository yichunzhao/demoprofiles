package com.ynz.demoprofiles.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Profile("json")
@Slf4j
public class ToJsonGreeting implements Greeting {
    private ObjectMapper objectMapper;

    @Autowired
    public ToJsonGreeting(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void sayHello() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("YYY", "Hello world.");
        map.put("ZZZ", "Hello world.");

        log.info(objectMapper.writeValueAsString(map));
    }
}
