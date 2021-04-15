package com.gauge.docdocker.rest;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gauge.docdocker.dao.CiJobDAO;
import com.gauge.viewmodel.ci_job;

@RestController
public class CiJobRest {
    @Resource
    public CiJobDAO ciJobDAO;

    @Resource
    private DiscoveryClient client ;	// 进行Eureka的发现服务

    @RequestMapping("/ci/discover")
    public Object discover() {	// 直接返回发现服务信息
        return this.client ;
    }

    @RequestMapping("/ci/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId() ;
    }

    @RequestMapping(value = "/ci/getAllJobList",method = RequestMethod.GET)
    public Object getAllJobList(){
        return this.ciJobDAO.getAllJobList();
    }
}
