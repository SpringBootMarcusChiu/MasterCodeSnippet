package com.marcuschiu.example.spring.boot.mastercodesnippet.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassUsingProperty {

    @Value("${hello.world}")
    private String propertyOne;

    public String retrievePropertyOne() {
        return propertyOne;
    }
}
