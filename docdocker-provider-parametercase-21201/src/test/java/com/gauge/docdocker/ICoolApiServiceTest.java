package com.gauge.docdocker;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import com.gauge.docdocker.service.ICoolApiService;


import com.gauge.viewmodel.CoolApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest(classes = ParameterCaseApi_21201_StartSpringCloudApplication.class )
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ICoolApiServiceTest {
    @Resource
    private ICoolApiService coolApiService ;
    @Test
    public void testGet() {

        System.out.println(this.coolApiService.get(1)
        );
    }

    @Test
    public void testAdd() {
        CoolApi coolApi = new CoolApi() ;
        coolApi.setApi_name("GetList" + System.currentTimeMillis());
        System.out.println(this.coolApiService.add(coolApi));
    }

    @Test
    public void testList() {

        System.out.println(this.coolApiService.list());
    }

}
