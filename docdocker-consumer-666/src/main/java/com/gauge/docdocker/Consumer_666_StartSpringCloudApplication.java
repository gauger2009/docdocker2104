package com.gauge.docdocker;

import com.gauge.commons.config.SmartLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

// 没有使用DataSource，则需要把spring-boot-starter-jdbc的依赖排除掉
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
//@EnableEurekaClient
//@RibbonClient(name="ribbonClient",configuration= SmartLoadBalanceConfig.class)
public class Consumer_666_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_666_StartSpringCloudApplication.class, args);
    }
}
