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
    public List<interface_parameter_case> getList() {
        return this.parameterCaseDAO.getList();
    }


}
