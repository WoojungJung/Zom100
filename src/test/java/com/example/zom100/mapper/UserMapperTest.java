package com.example.zom100.mapper;

import com.example.zom100.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Slf4j
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    private UserDto userDto;

    @BeforeEach
    void setUp(){
        userDto = new UserDto();
        userDto.setUserEmail("test@test.com");
        userDto.setUserPassword("1234");
    }
    @Test
    void insert() {
        userMapper.insert(userDto);
        assertThat(userMapper.selectUser(userDto))
                .isEqualTo(userDto.getUserNumber());
    }

    @Test
    void selectEmail() {
        userMapper.insert(userDto);
        assertThat(userMapper.selectEmail(userDto.getUserEmail()))
                .isEqualTo(1);
    }

    @Test
    void selectUser() { }
}