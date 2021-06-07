package com.gauge.docdocker.dao;

import com.gauge.viewmodel.interface_parameter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IParameterDAO {

    public interface_parameter getEntity(String key_id);

    public boolean edit(interface_parameter i);

    public boolean addIParameter(interface_parameter i);
}
