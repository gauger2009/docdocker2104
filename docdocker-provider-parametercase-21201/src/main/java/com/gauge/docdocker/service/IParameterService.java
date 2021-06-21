package com.gauge.docdocker.service;

import com.gauge.viewmodel.interface_parameter;

import java.util.List;

public interface IParameterService {
    public interface_parameter getEntity(String key_id);

    public List<interface_parameter> getList();
    
    public boolean edit(interface_parameter i);

    public boolean addIParameter(interface_parameter i);
}
