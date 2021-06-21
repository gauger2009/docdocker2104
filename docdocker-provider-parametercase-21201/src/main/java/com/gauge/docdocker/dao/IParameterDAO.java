package com.gauge.docdocker.dao;

import com.gauge.viewmodel.interface_parameter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IParameterDAO {

    public interface_parameter getEntity(String key_id);

    public List<interface_parameter> getList();

    public boolean edit(interface_parameter i);

    public boolean addIParameter(interface_parameter i);
}
