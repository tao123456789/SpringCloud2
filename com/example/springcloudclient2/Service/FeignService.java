package com.example.springcloudclient2.Service;

import com.example.springcloudclient2.Impl.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String get(String name){
        return eurekaClientFeign.getMessageFromClient(name);
    }
}
