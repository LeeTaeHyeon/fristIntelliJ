package com.jojoldu.book.sringboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 모든 필드 getter 생성
@RequiredArgsConstructor // 모든 final 필드가 포함된 생성자를 생성, final이 없으면 생성자에 포함 안됨
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
