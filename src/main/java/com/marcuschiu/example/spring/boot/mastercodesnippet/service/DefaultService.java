package com.marcuschiu.example.spring.boot.mastercodesnippet.service;

import com.marcuschiu.example.spring.boot.mastercodesnippet.model.Pojo1;
import com.marcuschiu.example.spring.boot.mastercodesnippet.model.group.Group1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DefaultService {

    @Autowired
    DefaultService2 defaultService2;

    @PostMapping("/default/1")
    public void test(@RequestBody Pojo1 pojo1) {
        defaultService2.test(pojo1);
    }
}
