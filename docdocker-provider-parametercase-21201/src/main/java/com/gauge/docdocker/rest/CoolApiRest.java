package com.gauge.docdocker.rest;

import com.gauge.docdocker.service.ICoolApiService;

import com.gauge.viewmodel.CoolApi;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  CoolApiRest {
    @Resource
    private ICoolApiService coolApiService ;
    @Resource
    private DiscoveryClient client ;	// 进行Eureka的发现服务
    @RequestMapping("/coolapi/discover")
    public Object discover() {	// 直接返回发现服务信息
        return this.client ;
    }

    @RequestMapping("/coolapi/sessionId")
    public Object id(HttpServletRequest request) {

        return request.getSession().getId() ;
    }

    @RequestMapping(value="/coolapi/get/{id}",method= RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {

        return this.coolApiService.get(id) ;
    }
    @RequestMapping(value="/coolapi/add",method=RequestMethod.POST)
    public Object add(@RequestBody CoolApi coolapi) {

        return this.coolApiService.add(coolapi) ;
    }
    @RequestMapping(value="/coolapi/list",method=RequestMethod.GET)
    public Object list() {

        return this.coolApiService.list() ;
    }
}
