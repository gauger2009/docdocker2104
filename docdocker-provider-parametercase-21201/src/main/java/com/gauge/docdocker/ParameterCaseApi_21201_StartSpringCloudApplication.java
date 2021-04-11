package com.gauge.docdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class ParameterCaseApi_21201_StartSpringCloudApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(ParameterCaseApi_21201_StartSpringCloudApplication.class, args);

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
//        System.out.println( "不要回答!不要回答!不要回答!" );
//    }
//}
