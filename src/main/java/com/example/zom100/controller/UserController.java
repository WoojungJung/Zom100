package com.example.zom100.controller;

import com.example.zom100.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/zom100user/*")
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String login(){ return "login"; }

    @GetMapping("/list")
    public String list(){return "list";}
}
