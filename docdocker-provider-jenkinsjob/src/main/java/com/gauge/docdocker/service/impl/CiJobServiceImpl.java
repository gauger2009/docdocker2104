package com.gauge.docdocker.service.impl;


import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.gauge.docdocker.dao.CiJobDAO;
import com.gauge.docdocker.service.CiJobService;
import com.gauge.viewmodel.ci_job;

import java.util.List;

@Service
public class CiJobServiceImpl implements CiJobService {
    @Resource
    public CiJobDAO ciJobDAO;

    @Override
    public List<ci_job> getAllJobList() {
        return ciJobDAO.getAllJobList();
    }
}
