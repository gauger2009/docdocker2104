package com.gauge.docdocker.rest;

import com.gauge.docdocker.service.IParameterCaseService;
import com.gauge.docdocker.service.IParameterService;
import com.gauge.viewmodel.interface_parameter;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class ParameterRest {
    @Resource
    private IParameterService iParameterService;

    @RequestMapping(value = "/parameter/getEntity/{key_id}", method = RequestMethod.GET)
    public interface_parameter getEntity(@PathVariable("key_id") String key_id) {
        return this.iParameterService.getEntity(key_id);
    }

    @RequestMapping(value = "/parameter/edit", method = RequestMethod.POST)
    public boolean edit(@RequestBody interface_parameter i) {
        return this.iParameterService.edit(i);
    }

    @RequestMapping(value = "/parameter/add", method = RequestMethod.POST)
    public boolean addIParameter(@RequestBody interface_parameter i) {
        return this.iParameterService.addIParameter(i);
    }
}
