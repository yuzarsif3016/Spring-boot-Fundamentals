package com.yusuf.di.setterdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSet {

    public OrderSet order;

    public UserSet(){
        //System.out.println("setter injection");
    }

    @Autowired
    public void setOrder(OrderSet order){
        this.order = order;
        //System.out.println("Order setter injected");
    }
}
