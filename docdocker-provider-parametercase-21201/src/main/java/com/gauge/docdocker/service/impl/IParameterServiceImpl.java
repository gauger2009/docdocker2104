package com.gauge.docdocker.service.impl;

import com.gauge.docdocker.dao.IParameterDAO;
import com.gauge.docdocker.service.IParameterService;
import com.gauge.viewmodel.interface_parameter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IParameterServiceImpl implements IParameterService {
    @Resource
    private IParameterDAO iParameterDAO;

    @Override
    public interface_parameter getEntity(String key_id) {
        return this.iParameterDAO.getEntity(key_id);
    }

    @Override
    public List<interface_parameter> getList() {
        return this.iParameterDAO.getList();
    }

    @Override
    public boolean edit(interface_parameter i) {
        return this.iParameterDAO.edit(i);
    }

    @Override
    public boolean addIParameter(interface_parameter i) {
        return this.iParameterDAO.addIParameter(i);
    }
}
