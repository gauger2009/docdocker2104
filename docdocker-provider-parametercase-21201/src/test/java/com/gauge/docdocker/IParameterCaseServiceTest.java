package com.gauge.docdocker;


import com.gauge.docdocker.service.IParameterCaseService;

import com.gauge.viewmodel.interface_parameter_case;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


@SpringBootTest(classes = ParameterCaseApi_21201_StartSpringCloudApplication.class )
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IParameterCaseServiceTest {
    @Resource
    private IParameterCaseService parameterCaseService ;
    @Test
    public void testGet() {

        System.out.println(this.parameterCaseService.getEntity("InvokePayrollCalcPlanV5")
        );
    }

    @Test
    public void testAdd() {
        interface_parameter_case interface_parameter_case = new interface_parameter_case() ;

        System.out.println(this.parameterCaseService.addCase(interface_parameter_case));
    }

    @Test
    public void testList() {

        System.out.println(this.parameterCaseService.getList());
    }

}
