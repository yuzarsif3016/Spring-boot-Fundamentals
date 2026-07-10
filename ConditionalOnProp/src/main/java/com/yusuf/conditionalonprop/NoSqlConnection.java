package com.yusuf.conditionalonprop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "Nosqlconnection",value = "enabled",havingValue = "kro",matchIfMissing = false)

public class NoSqlConnection {
    public NoSqlConnection() {
        System.out.println("NoSqlConnection created");
    }
}
