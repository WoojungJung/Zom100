package com.example.zom100.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor //임의로 데이터를 받을수도 있어서 추가 했다.
public class Criteria {
    private int page; //현재 페이지
    private int amount; //한 페이지 당 게시물 수

    public Criteria(){
        this.page =1;
        this.amount = 20;
    }

}
