package com.marcuschiu.example.spring.boot.mastercodesnippet.service;

import com.marcuschiu.example.spring.boot.mastercodesnippet.model.Pojo1;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
@Service
public class DefaultService2 {

    public void test(@Valid Pojo1 pojo1) {
        System.out.println(pojo1.str1 + " " + pojo1.str2);
    }
}
