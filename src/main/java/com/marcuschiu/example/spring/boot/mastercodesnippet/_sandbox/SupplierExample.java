package com.marcuschiu.example.spring.boot.mastercodesnippet._sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<List<String>> {

    @Override
    public List<String> get() {
        return new ArrayList<>();
    }
}
