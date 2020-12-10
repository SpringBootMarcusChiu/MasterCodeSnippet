package com.marcuschiu.example.spring.boot.mastercodesnippet.model;

import com.marcuschiu.example.spring.boot.mastercodesnippet.model.group.Group1;
import com.marcuschiu.example.spring.boot.mastercodesnippet.model.group.Group2;

import javax.validation.constraints.NotNull;

public class Pojo1 {

    @NotNull(message = "str1 should not be null")
    public String str1;

    @NotNull(message = "str2 should not be null")
    public String str2;
}
