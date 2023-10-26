package com.example.zom100.controller;

import com.example.zom100.dto.UserDto;
import com.example.zom100.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/zom100user/*")
public class UserController {
    private final UserService userService;
//    첫페이지(로그인) 진입
    @GetMapping("/login")
    public String login(){ return "login"; }

//    로그인
    @PostMapping("/login")
    public RedirectView login(UserDto userDto, HttpServletRequest req){
        try {
            long userNumber = userService.findUserAndRegister(userDto);
            req.getSession().setAttribute("userNumber", userNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return new RedirectView("/zom100user/login");
        }
        return new RedirectView("/zom100user/list");
    }
    @GetMapping("/list")
    public String list(){return "list";}
}
