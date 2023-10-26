package com.example.zom100.service;

import com.example.zom100.dto.UserDto;
import com.example.zom100.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@Slf4j
class UserServiceTest {

    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserService userService;

    private UserDto userDto;

    @BeforeEach
    void setUp(){
        userDto = new UserDto();
        userDto.setUserEmail("test2@test.com");
        userDto.setUserPassword("1234");
    }

    @Test
    void findUserAndRegister() {
        doNothing().when(userMapper).insert(any(UserDto.class));
        doReturn(1L).when(userMapper).selectUser(any(UserDto.class));

        Long userNumber = userService.findUserAndRegister(userDto);

        verify(userMapper, times(1)).insert(userDto);
        assertThat(userNumber).isEqualTo(1L);

    }
}