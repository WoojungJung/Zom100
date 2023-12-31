package com.example.zom100.service;

import com.example.zom100.dto.UserDto;
import com.example.zom100.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserMapper userMapper;

//    이메일 비밀번호로 회원번호 조회 - 없으면 회원가입
    public long findUserAndRegister(UserDto userDto){
        if(userDto==null){throw new IllegalArgumentException("회원정보누락");}
        if(userMapper.selectEmail(userDto.getUserEmail())==0) {
            userMapper.insert(userDto);
        }
        return Optional.ofNullable(userMapper.selectUser(userDto))
                .orElseThrow(()->{
                    throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
                });
    }
//    닉네임조회
    public String findUserId(Long userNumber){
        if(userNumber == null){throw new IllegalArgumentException("회원번호누락");}
            return Optional.ofNullable(userMapper.selectUserId(userNumber))
                    .orElseThrow(()->{
                        throw new IllegalArgumentException("아이디가 없습니다.");
                    });
    }


//    닉네임(userId)변경
    public void changeUserId(Long userNumber, String userId){
        if(userNumber==null || userId==null){throw new IllegalArgumentException("회원정보누락");}
        userMapper.updateUserId(userNumber,userId);
    }

    }
