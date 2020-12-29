package com.marcuschiu.example.spring.boot.mastercodesnippet.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@Import({Default1Component.class,
        Default2Component.class,
        DefaultComponent.class,
        DefaultNegComponent.class,
        DefaultLowestPrecedenceComponent.class})
public class OrderTest {

    @Autowired
    List<Rating> ratings;

    @Test
    public void givenOrder_whenInjected_thenByOrderValue() {
        assertThat(ratings.get(0).getRating(), is(equalTo(-1)));
        assertThat(ratings.get(1).getRating(), is(equalTo(1)));
        assertThat(ratings.get(2).getRating(), is(equalTo(2)));
        assertThat(ratings.get(3).getRating(), is(equalTo(0)));
        assertThat(ratings.get(4).getRating(), is(equalTo(Ordered.LOWEST_PRECEDENCE)));
    }
}
