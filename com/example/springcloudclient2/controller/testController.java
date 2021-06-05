package com.example.springcloudclient2.controller;

import com.example.springcloudclient2.Service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class testController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test1")
    public String helloRibbon() {
        System.out.println("触发方法");
        return "你好,this eureka port is  " + port;
    }

    @GetMapping("/{name}")
    public String helloRibbon(@PathVariable("name") String name) {
        return "你好    " + name + "\n"+ ",this eureka port is  " + port;
    }

    @Autowired
    FeignService feignService;

    @GetMapping("/test")
    public String get(@RequestParam(defaultValue = "sjj",required = false)String name){
        return feignService.get(name);
    }
}
