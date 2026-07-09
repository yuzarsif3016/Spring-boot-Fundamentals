package com.yusuf.dynamicallyinitiliazedbean;

public class OnlineOrder implements Order {
    public OnlineOrder() {
        System.out.println("Online Order initialized");
    }
    @Override
    public void CreateOrder() {

        System.out.println("offline Order Created");
    }
}
