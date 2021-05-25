package com.gauge.docdocker.controller;

import com.gauge.docdocker.model.ResponseEntityModel;
import com.gauge.docdocker.model.StatusEnum;
import com.gauge.viewmodel.interface_parameter_case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerJobController {

    @Autowired
    private ResponseEntityModel responseEntityModel;

    @RequestMapping(value = "/getResponseEntityModel")
    public ResponseEntityModel getResponseEntityModel(){
        interface_parameter_case ipc = new interface_parameter_case();
        ipc.setaction_name("测试");
        ipc.setCode("test001");
        responseEntityModel.setData(ipc);
        responseEntityModel.setMessage("");
        responseEntityModel.setStatus(StatusEnum.SUCESS);
        return responseEntityModel;
    }
}
