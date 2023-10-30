package com.example.zom100.controller;

import com.example.zom100.dto.UserDto;
import com.example.zom100.service.UserService;
import com.example.zom100.service.WishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/zom100wish/*")
public class WishController {
    private final WishService wishService;
    private final UserService userService;

    @GetMapping("/findId")
    public Map<String, Object> findUserInfo(HttpServletRequest req){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        Map<String, Object> userMap = new HashMap<>();
        String userId = userService.findUserId(userNumber);
        userMap.put("userId", userId);
        return userMap;
    }
}
