package com.gauge.docdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.logging.Logger;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class CoolApi_21201_StartSpringCloudApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(CoolApi_21201_StartSpringCloudApplication.class, args);

    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        // 指向main方法中的CoolApi_21201_StartSpringCloudApplication
//        return  builder.sources(CoolApi_21201_StartSpringCloudApplication.class);
//    }



}

//
//public class CoolApi_21201_StartSpringCloudApplication
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
