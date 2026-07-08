package com.yusuf.di.ctordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCtor {

    public OrderCtor order;
    public Invoice invoice;

    //@Autowired == optional if we have only one ctor
    //@Autowired => only one ctor with autowire is allowed
    public UserCtor(OrderCtor order) {
        this.order = order;
        System.out.println("ctor injection");
    }

    @Autowired
    public UserCtor(Invoice invoice) {
        this.invoice = invoice;
        System.out.println("ctor injection");
    }


}
