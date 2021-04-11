package com.gauge.docdocker.rest;

import com.gauge.docdocker.dao.IParameterCaseDAO;
import com.gauge.viewmodel.interface_parameter_case;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ParameterCaseRest {
    @Resource
    private IParameterCaseDAO parameterCaseDAO ;
    @Resource
    private DiscoveryClient client ;	// 进行Eureka的发现服务
    @RequestMapping("/case/discover")
    public Object discover() {	// 直接返回发现服务信息
        return this.client ;
    }

    @RequestMapping("/case/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId() ;
    }

    @RequestMapping(value="/case/get/{code}",method= RequestMethod.GET)
    public Object get(@PathVariable("code") String code) {
        return this.parameterCaseDAO.getEntity(code) ;
    }
    @RequestMapping(value="/case/add",method=RequestMethod.POST)
    public Object add(@RequestBody interface_parameter_case interface_parameter_case) {
        return this.parameterCaseDAO.addCase(interface_parameter_case) ;
    }
    @RequestMapping(value="/case/list",method=RequestMethod.GET)
    public Object list() {
        return this.parameterCaseDAO.getList() ;
    }
}
