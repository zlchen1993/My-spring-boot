package com.czl.study;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping
    public String Helloworld(){
        return "hello world!";
    }
}
