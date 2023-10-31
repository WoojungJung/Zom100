package com.example.zom100.mapper;

import com.example.zom100.dto.Criteria;
import com.example.zom100.dto.WishDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WishMapper {
    List<WishDto> selectWishList(@Param("criteria") Criteria criteria, Long userNumber);
}

