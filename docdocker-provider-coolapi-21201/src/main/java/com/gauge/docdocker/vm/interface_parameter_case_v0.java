package com.gauge.docdocker.vm;

import java.io.Serializable;

@SuppressWarnings("serial")
public class interface_parameter_case_v0 implements Serializable {

    private String key_id ;
    private String param_id ;
    private String code ;
    private String action_name ;
    private String service_name ;
    private String name ;
    private String value ;
    private String path ;
    private String operate_dt ;
    private String dev_operate_by ;
    private String test_operate_by ;



    @Override
    public String toString() {
        return "CoolApi [service_name=" + service_name + ", action_name=" + action_name + ", code=" + code
                + "]";
    }

    public String getKey_id() {
        return key_id;
    }
    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getParam_id() {
        return param_id;
    }
    public void setParam_id(String param_id) {
        this.param_id = param_id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getaction_name() {
        return action_name;
    }
    public void setaction_name(String action_name) {
        this.action_name = action_name;
    }

    public String getservice_name() {
        return service_name;
    }
    public void setservice_name(String service_name) {
        this.service_name = service_name;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getvalue() {
        return value;
    }
    public void setvalue(String value) {
        this.value = value;
    }

    public String getpath() {
        return path;
    }
    public void setpath(String path) {
        this.path = path;
    }

//    public String getoperate_dt() {
//        return operate_dt;
//    }
//    public void setoperate_dt(Datetime operate_dt) {
//        this.operate_dt = operate_dt;
//    }

    public String getdev_operate_by() {
        return dev_operate_by;
    }
    public void setdev_operate_by(String dev_operate_by) {
        this.dev_operate_by = dev_operate_by;
    }

    public String gettest_operate_by() {
        return test_operate_by;
    }
    public void settest_operate_by(String test_operate_by) {
        this.test_operate_by = test_operate_by;
    }


}
