package com.example.zom100.service;

import com.example.zom100.dto.UserDto;
import com.example.zom100.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserMapper userMapper;

    // 등록된 이메일인지 존재 확인 0/1
    @Transactional(readOnly = true)
    public int userEmailCheck(String userEmail){
        if(userEmail==null){throw new IllegalArgumentException("이메일 정보 누락!");}
        return userMapper.selectEmail(userEmail);
    }

//    최초가입
    public void register(UserDto userDto){
        if(userDto==null){throw new IllegalArgumentException("회원정보누락");}
        userMapper.insert(userDto);
    }

//    이메일 비밀번호로 회원번호 조회
    @Transactional(readOnly = true)
    public long findUser(UserDto userDto){
        if(userDto==null){throw new IllegalArgumentException("회원정보누락");}
        return userMapper.selectUser(userDto);
    }

}
