package com.gauge.docdocker.service;

import com.gauge.viewmodel.interface_parameter;

public interface IParameterService {
    public interface_parameter getEntity(String key_id);

    public boolean edit(interface_parameter i);

    public boolean addIParameter(interface_parameter i);
}
