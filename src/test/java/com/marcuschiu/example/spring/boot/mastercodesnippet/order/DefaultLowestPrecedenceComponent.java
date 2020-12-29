package com.marcuschiu.example.spring.boot.mastercodesnippet.order;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class DefaultLowestPrecedenceComponent implements Rating {
    @Override
    public int getRating() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
