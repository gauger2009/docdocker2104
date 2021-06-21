package com.gauge.docdocker.rest;

import com.gauge.docdocker.service.IParameterService;
import org.springframework.web.bind.annotation.*;
import com.gauge.viewmodel.interface_parameter;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ParameterRest {
    @Resource
    private IParameterService iParameterService;

    @RequestMapping(value = "/parameter/getList", method = RequestMethod.GET)
    public List<interface_parameter> getList() {
        return this.iParameterService.getList();
    }

    @RequestMapping(value = "/parameter/getEntity", method = RequestMethod.POST)
    public interface_parameter getEntity(@RequestBody String key_id) {
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
