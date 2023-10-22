package com.example.zom100.controller;

import com.example.zom100.service.UserService;
import com.example.zom100.service.WishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/zom100wish/*")
public class WishController {
    private final WishService wishService;
    private final UserService userService;

}
