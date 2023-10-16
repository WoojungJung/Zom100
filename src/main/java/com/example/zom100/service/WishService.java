package com.example.zom100.service;

import com.example.zom100.mapper.WishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class WishService {
    private final WishMapper wishMapper;
}
