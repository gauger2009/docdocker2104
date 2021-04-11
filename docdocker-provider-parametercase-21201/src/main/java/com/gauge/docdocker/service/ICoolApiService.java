package com.gauge.docdocker.service;


import com.gauge.viewmodel.CoolApi;

import java.util.List;



public interface ICoolApiService {
    public CoolApi get(long id) ;
    public boolean add(CoolApi dept) ;
    public List<CoolApi> list() ;
}
