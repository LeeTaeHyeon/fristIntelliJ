package com.jojoldu.book.sringboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // json을 반환하는 컨트롤러로 만들어 주는 역할
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
