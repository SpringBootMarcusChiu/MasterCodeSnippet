package com.marcuschiu.example.spring.boot.mastercodesnippet.order;

import org.springframework.stereotype.Component;

@Component
public class DefaultComponent implements Rating {
    @Override
    public int getRating() {
        return 0;
    }
}
