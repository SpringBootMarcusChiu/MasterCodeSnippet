package com.marcuschiu.example.spring.boot.mastercodesnippet.property;

import com.marcuschiu.example.spring.boot.mastercodesnippet.config.ClassUsingProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ClassUsingProperty.class)
@TestPropertySource
public class PropertyTest {

    @Autowired
    ClassUsingProperty classUsingProperty;

    @Test
    public void givenDefaultTPS_whenVariableRetrieved_thenDefaultFileReturned() {
        String output = classUsingProperty.retrievePropertyOne();
        assertEquals("default-value", output);
    }
}