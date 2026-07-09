package com.yusuf.dynamicallyinitiliazedbean;

public class OfflineOrder implements Order {

    public OfflineOrder() {
        System.out.println("Offline Order initialized");
    }

    @Override
    public void CreateOrder() {
        System.out.println("offline Order Created");
    }
}
