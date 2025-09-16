package com.SIH.Amigo.controller;

import com.SIH.Amigo.model.Users;
import com.SIH.Amigo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody Users user)
    {
        return userService.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody Users user)
    {
        return userService.verify(user);
    }

}
