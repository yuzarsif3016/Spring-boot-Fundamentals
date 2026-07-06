package com.yusuf.controller_layer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @RequestMapping(path = "/fetchUser/{rollno}",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable int roll_id) {
        return "Hello World! " + roll_id;
    }
    @RequestMapping(path = "/saveUser",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser() {
        return "Hello User Saved";
    }
}
