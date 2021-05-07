package com.gauge.docdocker;


import com.gauge.docdocker.service.IParameterCaseService;

import com.gauge.viewmodel.interface_parameter_case;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


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




    /*

     key_id
                param_id
        code
                action_name
        service_name
                name
        value=
                path
        operate_dt
                dev_operate_by
        test_operate_by

     */
    @Test
    public void testAdd() throws ParseException {
        interface_parameter_case interface_parameter_case = new interface_parameter_case() ;
        String service_name="PayrollResult";
        String action_name="InvokePayrollPostingV5";
        int idx = (int)(Math.random()*100);
        String code="Case "+idx;


        interface_parameter_case.setKey_id( UUID.randomUUID().toString());
        interface_parameter_case.setParam_id("ac4b7aad-ea12-45d4-9390-20da898e06d3");
        interface_parameter_case.setCode("Case 1");
        interface_parameter_case.setaction_name(action_name);
        interface_parameter_case.setservice_name(service_name);
        StringBuilder sbd = new StringBuilder();
        sbd.append(service_name);
        sbd.append(" - " );
        sbd.append(action_name);
        sbd.append(" 场景 :"+ code);
        interface_parameter_case.setname(sbd.toString());
        interface_parameter_case.setvalue("");
        interface_parameter_case.setpath(new StringBuilder().append(service_name).append("/").append(action_name).toString());
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2021-04-13 19:59:46";
        Date dateParse = sdf.parse(dateString);
        interface_parameter_case.setoperate_dt(dateParse);

        interface_parameter_case.setdev_operate_by("Richter");
        interface_parameter_case.settest_operate_by("gauge");


        System.out.println(this.parameterCaseService.addCase(interface_parameter_case));
    }

    @Test
    public void testList() {

        System.out.println(this.parameterCaseService.getList());
    }
    @Test
    public void testListByPm() {
//        String service_name="PayrollResult";
//        String action_name="InvokePayrollPostingV5";
        String param_id="341ceb0c-2cbf-4b7f-9dab-1c131f7c2980";
        System.out.println(this.parameterCaseService.getListByPm( param_id));
    }

    @Test
    public void testEditCase() {
//        String service_name="PayrollResult";
//        String action_name="InvokePayrollPostingV5";
        String value = "null/N/A";
        String name = "_场景二_";
        String case_id="8fcce331-af68-4ff3-8118-81fa2b3be63b";
        System.out.println(this.parameterCaseService.editCase( value,name,case_id));
    }

    @Test
    public void testGetById(){
        System.out.println(this.parameterCaseService.getEntityId("00c8d750-5059-4451-8793-0b0476b3d27e"));
    }

}
