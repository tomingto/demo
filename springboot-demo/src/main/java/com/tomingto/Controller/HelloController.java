package com.tomingto.Controller;

import com.tomingto.pojo.User;
import com.tomingto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot";
    }

    @GetMapping("/select")
    public User SelectUser(Integer Id){
        return userService.SelectUserById(Id);
    }
}
