package com.gauge.docdocker.rest;

import com.gauge.docdocker.dao.IParameterCaseDAO;
import com.gauge.docdocker.service.IParameterCaseService;
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
    private IParameterCaseService parameterCaseService ;
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
        return this.parameterCaseService.getEntity(code) ;
    }

    @RequestMapping(value="/case/getById/{key_id}",method= RequestMethod.GET)
    public Object getById(@PathVariable("key_id") String key_id) {
        return this.parameterCaseService.getEntityId(key_id) ;
    }

    @CrossOrigin(value = "http://localhost:55022")//接口接受来自http://localhost:55022 地址的请求
    @RequestMapping(value="/case/add",method=RequestMethod.POST)
    public Object add(@RequestBody interface_parameter_case interface_parameter_case) {
        return this.parameterCaseService.addCase(interface_parameter_case) ;
    }
    @CrossOrigin(origins = "*",maxAge = 3600)
    //@CrossOrigin(value = "http://localhost:55022")//接口接受来自http://localhost:55022 地址的请求
    @RequestMapping(value="/case/list",method=RequestMethod.GET)
    public Object list() {
        return this.parameterCaseService.getList() ;
    }


    @CrossOrigin(origins = "*",maxAge = 3600)
    // @CrossOrigin(value = "http://localhost:55022,http://192.168.1.5:13579/")//接口接受来自http://localhost:55022 地址的请求
    @RequestMapping(value="/case/listbypm",method=RequestMethod.GET)
    public Object listByPm(String param_id) {
        return this.parameterCaseService.getListByPm(param_id) ;
    }

//    // http://paramcase-21201.com:21201/case/edit?value=N/A&case_id=8fcce331-af68-4ff3-8118-81fa2b3be63b
//    @CrossOrigin(value = "http://localhost:55022")//接口接受来自http://localhost:55022 地址的请求
//    @RequestMapping(value="/case/edit",method=RequestMethod.GET)
//    public Object edit(String value,String case_id) {
//        return this.parameterCaseService.editCase(value,case_id) ;
//    }


    // http://paramcase-21201.com:21201/case/edit?value=N/A&case_id=8fcce331-af68-4ff3-8118-81fa2b3be63b
    @CrossOrigin(origins = "*",maxAge = 3600)
    // @CrossOrigin(value = "http://localhost:55022,http://192.168.1.5:13579/")//接口接受来自http://localhost:55022 地址的请求
    @RequestMapping(value="/case/edit",method=RequestMethod.POST)
    public Object edit(String value,String name,String case_id) {
        return this.parameterCaseService.editCase(value,name,case_id) ;
    }

    //实现跨域注解
    //origin="*"代表所有域名都可访问
    //maxAge飞行前响应的缓存持续时间的最大年龄，简单来说就是Cookie的有效期 单位为秒
    //若maxAge是负数,则代表为临时Cookie,不会被持久化,Cookie信息保存在浏览器内存中,浏览器关闭Cookie就消失
    @CrossOrigin(origins = "*",maxAge = 3600)
   // @CrossOrigin(value = "http://localhost:55022,http://192.168.1.5:13579/")//接口接受来自http://localhost:55022 地址的请求
    @RequestMapping(value="/case/editplus",method=RequestMethod.POST)
    public Object editPlus(@RequestBody interface_parameter_case interface_parameter_case) {
        String value = interface_parameter_case.getvalue();
        String case_id=interface_parameter_case.getKey_id();
        String name = interface_parameter_case.getname();
        return this.parameterCaseService.editCase(value,name,case_id) ;
    }
}
