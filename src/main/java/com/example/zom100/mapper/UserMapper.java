package com.example.zom100.mapper;

import com.example.zom100.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

//    등록된 이메일인지 조회 1/0
    int selectEmail(String userEmail);

//    최초등록-회원가입
    void insert(UserDto userDto);

//    이메일,비번으로 사용자번호 조회
    long selectUser(UserDto userDto);

//    닉네임(ID), 이메일 조회
    String selectUserId(Long userNumber);
}

