package com.yusuf.controller_layer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/")
public class SampleRestController {

    @GetMapping(path="restUser")
    public String sayHelloRest(@RequestParam (name="firstname") String firstname) {
        return "Hello World! Rest API" + firstname;
    }
    @PostMapping(path="saveUserRest")
    public String saveUserRest() {
        return "Hello User Saved Rest";
    }
}
