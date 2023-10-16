package com.example.zom100.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class WishDto {
    private Long wishNumber;
    private int wishCnt;
    private String wishContent;
    private int wishStatus;
    private Long userNumber;
}
