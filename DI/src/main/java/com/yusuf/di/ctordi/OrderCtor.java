package com.yusuf.di.ctordi;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderCtor {
    public OrderCtor(){
        System.out.println("Order injected");
    }
}
