package com.gauge.docdocker.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.gauge.docdocker.model.ResponseEntityModel;
import com.gauge.docdocker.model.StatusEnum;
import com.gauge.viewmodel.interface_parameter_case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerParamCaseController {
     // 1）使用eureka之前，客户端直接操作微服务原始地址
    	public static final String DEPT_GET_URL = "http://paramcase-21201.com:21201/case/get/";
    	public static final String DEPT_GETBYID_URL = "http://paramcase-21201.com:21201/case/getById/";
    	public static final String DEPT_LIST_URL = "http://paramcase-21201.com:21201/case/list/";
        public static final String DEPT_LISTBYPM_URL = "http://paramcase-21201.com:21201/case/listbypm";
    	public static final String DEPT_ADD_URL = "http://paramcase-21201.com:21201/case/add";
        public static final String DEPT_EDITPLUS_URL = "http://paramcase-21201.com:21201/case/editplus";
    //  2） 使用eureka之后，这里写的是在eureka中注册的服务名称，而非之前的原始服务地址！
//    public static final String CASE_GET_URL = "http://MICROCLOUD-PROVIDER-CASE/case/get/";
//    public static final String CASE_LIST_URL = "http://MICROCLOUD-PROVIDER-CASE/case/list/";
//    public static final String CASE_ADD_URL = "http://MICROCLOUD-PROVIDER-CASE/case/add?name=";

    public static final String DEPT_REST_TOPIC = "MICROCLOUD-PROVIDER-CASE";

    @Autowired
    private ResponseEntityModel responseEntityModel;
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders headers;
    @Resource
    private LoadBalancerClient loadBalancerClient ;

    @RequestMapping(value = "/consumer/case/add",method = RequestMethod.POST)
    public Object add(@RequestBody interface_parameter_case vm){
        boolean isSuccess = this.restTemplate.exchange(
                DEPT_ADD_URL,HttpMethod.POST, new HttpEntity<Object>(vm, this.headers),Boolean.class)
                .getBody();
        responseEntityModel.setData(isSuccess);
        responseEntityModel.setMessage("");
        responseEntityModel.setStatus(StatusEnum.SUCESS);
        return responseEntityModel;
    }

    @RequestMapping(value = "/consumer/case/editplus",method = RequestMethod.POST)
    public Object editplus(@RequestBody interface_parameter_case vm){
        boolean isSuccess = this.restTemplate.exchange(
                DEPT_EDITPLUS_URL,HttpMethod.POST, new HttpEntity<interface_parameter_case>(this.headers),Boolean.class)
                .getBody();
        return isSuccess;
    }

    @RequestMapping(value = "/consumer/case/listbypm")
    public Object listByPm(String param_id){

        List<interface_parameter_case> list = this.restTemplate
                .exchange(DEPT_LISTBYPM_URL +"?param_id="+ param_id, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class)
                .getBody();
        return list;

    }

    @RequestMapping(value = "/consumer/case/getById")
    public Object getCaseId(String key_id) {

        interface_parameter_case entity = this.restTemplate
                .exchange(DEPT_GETBYID_URL + key_id, HttpMethod.GET,new HttpEntity<Object>(this.headers), interface_parameter_case.class)
                .getBody();
        return entity;
    }

    @RequestMapping(value = "/consumer/case/get")
    public Object getCase(String code) {
            // ServiceInstance serviceInstance = this.loadBalancerClient.choose("paramcase-21201.com:21201/") ;
        // 使用eureka之后，这里写的是在eureka中注册的服务名称，而非之前的原始服务地址！
        //ServiceInstance serviceInstance = this.loadBalancerClient.choose("MICROCLOUD-PROVIDER-CASE") ;
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose(DEPT_REST_TOPIC);
//         System.out.println(
//                 "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
//                         + "、port = " + serviceInstance.getPort()
//                         + "、serviceId = " + serviceInstance.getServiceId());
        interface_parameter_case entity = this.restTemplate
                .exchange(DEPT_GET_URL + code, HttpMethod.GET,new HttpEntity<Object>(this.headers), interface_parameter_case.class)
                .getBody();
        return entity;
    }

    @CrossOrigin(value = "http://localhost:55022")//接口接受来自http://localhost:55022 地址的请求
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/case/list")
    public Object list() {
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose("paramcase-21201.com:21201/") ;
//
//        System.out.println(
//                "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
//                        + "、port = " + serviceInstance.getPort()
//                        + "、serviceId = " + serviceInstance.getServiceId());

//        HttpHeaders headers = new HttpHeaders();
//        this.headers.add("Accept", "application/json");
//        this.headers.add("Accept-Encoding", "gzip");
//        this.headers.add("Content-Encoding", "UTF-8");
//        this.headers.add("Content-Type", "application/json;charset=UTF-8");
//        this.headers.add("Access-Control-Allow-Origin", "http://localhost:55022/");

        List<interface_parameter_case> allEntity = this.restTemplate
                .exchange(DEPT_LIST_URL, HttpMethod.GET,
                        new HttpEntity<Object>(this.headers), List.class)
                .getBody();
        return allEntity;
    }

//    @SuppressWarnings("unchecked")
//    @RequestMapping(value = "/consumer/case/list")
//    public Object listCase() {
//        this.headers.add("Access-Control-Allow-Origin", "*");
//        HttpEntity<String> postEntity = new HttpEntity<>(dataStr, headers);
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
