package com.yusuf.conditionalonprop;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    MySqlConnection mySqlConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init() {
        System.out.println("init");
        System.out.println("is mysql connection null : " + Objects.isNull(mySqlConnection));
        System.out.println("is nosql connection null : " + Objects.isNull(noSqlConnection));
    }
}
