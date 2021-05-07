package com.gauge.docdocker.service.impl;

import com.gauge.docdocker.dao.IParameterCaseDAO;
import com.gauge.docdocker.service.IParameterCaseService;
import com.gauge.viewmodel.interface_parameter_case;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParameterCaseServiceImpl implements IParameterCaseService {

    @Resource
    private IParameterCaseDAO parameterCaseDAO ;

    @Override
    public boolean addCase(interface_parameter_case vm) {
        return parameterCaseDAO.addCase(vm);
    }

    @Override
    public interface_parameter_case getEntity(String code) {
        return parameterCaseDAO.getEntity(code);
    }

    @Override
    public interface_parameter_case getEntityId(String key_id) {
        return this.parameterCaseDAO.getEntityId(key_id);
    }

    @Override
    public List<interface_parameter_case> getList() {
        return this.parameterCaseDAO.getList();
    }

    @Override
    public List<interface_parameter_case> getListByPm(  String param_id) {
        return this.parameterCaseDAO.getListByPm( param_id);
    }

    @Override
    public boolean editCase(String value,String name,String case_id ) {
        return  this.parameterCaseDAO.editCase(value,name,case_id);
    }

}
