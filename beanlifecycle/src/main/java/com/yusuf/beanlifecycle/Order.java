package com.yusuf.beanlifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    public Order() {
        System.out.println("Lazy bean initialized");
    }
}
