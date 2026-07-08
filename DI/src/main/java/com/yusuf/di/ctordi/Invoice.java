package com.yusuf.di.ctordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

    @Lazy
    @Autowired
    public UserCtor userCtor;

    public Invoice(){
        //this.userCtor = userCtor;
        System.out.println("invoice injection");
    }
}
