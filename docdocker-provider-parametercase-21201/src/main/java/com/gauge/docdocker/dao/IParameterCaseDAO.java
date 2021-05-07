package com.gauge.docdocker.dao;

import com.gauge.viewmodel.interface_parameter_case;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface IParameterCaseDAO {
    public boolean addCase(interface_parameter_case vm) ;
    public interface_parameter_case getEntity(String code) ;
    public interface_parameter_case getEntityId(String key_id) ;
    public List<interface_parameter_case> getList() ;
    public List<interface_parameter_case> getListByPm(  String param_id) ;
    public boolean editCase(@Param("value") String value,@Param("name") String name,@Param("case_id")String case_id ) ;
}