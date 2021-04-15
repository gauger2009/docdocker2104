package com.gauge.docdocker.dao;

import com.gauge.viewmodel.ci_job;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CiJobDAO {
    public List<ci_job> getAllJobList();
}
