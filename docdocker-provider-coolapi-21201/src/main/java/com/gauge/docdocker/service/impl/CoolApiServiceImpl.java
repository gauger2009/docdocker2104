package com.gauge.docdocker.service.impl;

import com.gauge.docdocker.dao.ICoolApiDAO;
import com.gauge.docdocker.service.ICoolApiService;


import com.gauge.viewmodel.CoolApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoolApiServiceImpl implements ICoolApiService {
    @Resource
    private ICoolApiDAO coolApiDAO ;
    @Override
    public CoolApi get(long id) {
        return this.coolApiDAO.findById(id);
    }

    @Override
    public boolean add(CoolApi coolApi) {

        return this.coolApiDAO.doCreate(coolApi);
    }

    @Override
    public List<CoolApi> list() {
        return this.coolApiDAO.findAll();
    }

}
