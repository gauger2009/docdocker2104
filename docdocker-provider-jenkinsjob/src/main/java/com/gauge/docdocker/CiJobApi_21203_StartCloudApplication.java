package com.gauge.docdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class CiJobApi_21203_StartCloudApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(CiJobApi_21203_StartCloudApplication.class, args);

    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        // 指向main方法中的CoolApi_21201_StartSpringCloudApplication
//        return  builder.sources(CoolApi_21201_StartSpringCloudApplication.class);
//    }



}