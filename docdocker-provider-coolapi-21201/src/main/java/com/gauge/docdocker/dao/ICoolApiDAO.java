package com.gauge.docdocker.dao;


import java.util.List;


import com.gauge.viewmodel.CoolApi;
import org.apache.ibatis.annotations.Mapper;


    @Mapper
    public interface ICoolApiDAO {
        public boolean doCreate(CoolApi vm) ;
        public CoolApi findById(Long id) ;
        public List<CoolApi> findAll() ;
    }