package com.yusuf.dynamicallyinitiliazedbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
    @Autowired
    Order order;

    @PostMapping("/createOrder")
    public ResponseEntity<String> CreateOrder() {
        order.CreateOrder();
        return ResponseEntity.ok("");
    }
}
