package com.example.zom100.service;

import com.example.zom100.dto.Criteria;
import com.example.zom100.dto.WishDto;
import com.example.zom100.mapper.WishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WishService {
    private final WishMapper wishMapper;

    public List<WishDto> findListPage(Criteria criteria, Long userNumber){
        if(criteria == null || userNumber == null) {throw new IllegalArgumentException("페이징정보누락");}
        return wishMapper.selectWishList(criteria,userNumber);
    }

}
