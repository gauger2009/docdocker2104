package com.gauge.docdocker.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.gauge.viewmodel.interface_parameter_case;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerParamCaseController {
     // 1）使用eureka之前，客户端直接操作微服务原始地址
    	public static final String DEPT_GET_URL = "http://paramcase-21201.com:21201/case/get/";
    	public static final String DEPT_LIST_URL = "http://paramcase-21201.com:21201/case/list/";
    	public static final String DEPT_ADD_URL = "http://paramcase-21201.com:21201/case/add?name=";

    //  2） 使用eureka之后，这里写的是在eureka中注册的服务名称，而非之前的原始服务地址！
//    public static final String CASE_GET_URL = "http://MICROCLOUD-PROVIDER-CASE/case/get/";
//    public static final String CASE_LIST_URL = "http://MICROCLOUD-PROVIDER-CASE/case/list/";
//    public static final String CASE_ADD_URL = "http://MICROCLOUD-PROVIDER-CASE/case/add?name=";

    public static final String DEPT_REST_TOPIC = "MICROCLOUD-PROVIDER-CASE";

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;
    @Resource
    private LoadBalancerClient loadBalancerClient ;
    @RequestMapping(value = "/consumer/case/get")
    public Object getCase(String code) {
            ServiceInstance serviceInstance = this.loadBalancerClient.choose("paramcase-21201.com:21201/") ;
        // 使用eureka之后，这里写的是在eureka中注册的服务名称，而非之前的原始服务地址！
        //ServiceInstance serviceInstance = this.loadBalancerClient.choose("MICROCLOUD-PROVIDER-CASE") ;
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose(DEPT_REST_TOPIC);
        System.out.println(
                "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
                        + "、port = " + serviceInstance.getPort()
                        + "、serviceId = " + serviceInstance.getServiceId());
        interface_parameter_case entity = this.restTemplate
                .exchange(DEPT_REST_TOPIC + code, HttpMethod.GET,new HttpEntity<Object>(this.headers), interface_parameter_case.class)
                .getBody();
        return entity;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/case/list")
    public Object list() {
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose("paramcase-21201.com:21201/") ;
//
//        System.out.println(
//                "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
//                        + "、port = " + serviceInstance.getPort()
//                        + "、serviceId = " + serviceInstance.getServiceId());
        List<interface_parameter_case> allEntity = this.restTemplate
                .exchange(DEPT_LIST_URL, HttpMethod.GET,
                        new HttpEntity<Object>(this.headers), List.class)
                .getBody();
        return allEntity;
    }

//    @SuppressWarnings("unchecked")
//    @RequestMapping(value = "/consumer/case/list")
//    public Object listCase() {
//        List<interface_parameter_case> allEntity = this.restTemplate
//                .getForObject(DEPT_LIST_URL,  List.class);
//
//        return allEntity;
//    }




    @RequestMapping(value = "/consumer/case/add")
    public Object addCase(interface_parameter_case param_case) throws Exception {
        Boolean flag = this.restTemplate.exchange(DEPT_REST_TOPIC, HttpMethod.POST,
                new HttpEntity<Object>(param_case, this.headers), Boolean.class)
                .getBody();
        return flag;
    }
}
