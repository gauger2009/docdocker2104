package com.gauge.docdocker.service;

import com.gauge.viewmodel.interface_parameter_case;

import java.util.List;


public interface IParameterCaseService {

    public boolean addCase(interface_parameter_case vm) ;
    public interface_parameter_case getEntity(String code) ;
    public List<interface_parameter_case> getList() ;


}
