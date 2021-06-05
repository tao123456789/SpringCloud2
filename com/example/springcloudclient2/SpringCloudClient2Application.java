package com.example.springcloudclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.*;

@SpringBootApplication
@EnableWebSecurity
@Configuration
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClient2Application.class, args);
    }

}
