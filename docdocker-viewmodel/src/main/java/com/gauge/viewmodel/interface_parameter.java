package com.gauge.viewmodel;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class interface_parameter implements Serializable {

    private String key_id;
    private String action_id;
    private String code;
    private String action_name;
    private String service_name;
    private String name;
    private boolean is_input;
    private String value;
    private String dev_operate_by;
    private String test_operate_by;
    private Date operate_dt;
    private Date last_update_dt;

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getAction_id() {
        return action_id;
    }

    public void setAction_id(String action_id) {
        this.action_id = action_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_input() {
        return is_input;
    }

    public void setIs_input(boolean is_input) {
        this.is_input = is_input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDev_operate_by() {
        return dev_operate_by;
    }

    public void setDev_operate_by(String dev_operate_by) {
        this.dev_operate_by = dev_operate_by;
    }

    public String getTest_operate_by() {
        return test_operate_by;
    }

    public void setTest_operate_by(String test_operate_by) {
        this.test_operate_by = test_operate_by;
    }

    public Date getOperate_dt() {
        return operate_dt;
    }

    public void setOperate_dt(Date operate_dt) {
        this.operate_dt = operate_dt;
    }

    public Date getLast_update_dt() {
        return last_update_dt;
    }

    public void setLast_update_dt(Date last_update_dt) {
        this.last_update_dt = last_update_dt;
    }

    @Override
    public String toString() {
        return "interface_parameter_case{" +
                "key_id='" + key_id + '\'' +
                ", action_id='" + action_id + '\'' +
                ", code='" + code + '\'' +
                ", action_name='" + action_name + '\'' +
                ", service_name='" + service_name + '\'' +
                ", name='" + name + '\'' +
                ", is_input=" + is_input +
                ", value='" + value + '\'' +
                ", dev_operate_by='" + dev_operate_by + '\'' +
                ", test_operate_by='" + test_operate_by + '\'' +
                ", operate_dt=" + operate_dt +
                ", last_update_dt=" + last_update_dt +
                '}';
    }

}
