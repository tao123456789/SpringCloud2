package com.example.springcloudclient2.Impl;


import com.example.springcloudclient2.FeignConfig.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Component   //注入到spring 中 否则 无法注入的
@FeignClient(name = "service-1",configuration = FeignConfiguration.class) //value表示调用的服务名
public interface EurekaClientFeign {
    @GetMapping("/test")    //客户端的方法地址
    String getMessageFromClient(@RequestParam(value = "name")String name);
}
