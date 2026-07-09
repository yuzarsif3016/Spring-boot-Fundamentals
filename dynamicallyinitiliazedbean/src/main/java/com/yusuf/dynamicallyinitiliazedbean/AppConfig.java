package com.yusuf.dynamicallyinitiliazedbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Order CreateOrder(@Value("${isOnlineOrder}")  boolean isOnlineOrder) {
        if (isOnlineOrder) {
            return new OnlineOrder();
        }else{
            return new OfflineOrder();
        }
    }
}
