package com.marcuschiu.example.spring.boot.mastercodesnippet.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Default2Component implements Rating {
    @Override
    public int getRating() {
        return 2;
    }
}
