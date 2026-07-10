package com.yusuf.conditionalonprop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlconnection",value = "enabled",havingValue = "kro",matchIfMissing = false)
public class MySqlConnection {
    public MySqlConnection() {
        System.out.println("MySqlConnection created");
    }
}
