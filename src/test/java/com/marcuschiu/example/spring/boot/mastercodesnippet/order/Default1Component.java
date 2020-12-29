package com.marcuschiu.example.spring.boot.mastercodesnippet.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Default1Component implements Rating {
    @Override
    public int getRating() {
        return 1;
    }
}
