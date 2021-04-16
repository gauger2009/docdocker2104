package com.gauge.docdocker.service;

import com.gauge.viewmodel.interface_parameter_case;

import java.util.List;


public interface IParameterCaseService {

    public boolean addCase(interface_parameter_case vm) ;
    public interface_parameter_case getEntity(String code) ;
    public List<interface_parameter_case> getList() ;

    public List<interface_parameter_case> getListByPm( String param_id);
    public boolean editCase(String value,String name,String case_id ) ;
}
