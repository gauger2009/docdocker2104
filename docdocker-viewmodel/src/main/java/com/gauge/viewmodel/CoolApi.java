package com.gauge.viewmodel;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CoolApi implements Serializable {

    private Long api_id ;
    private String api_name ;
    private String api_desc ;

    //    public CoolApi(Long api_id, String api_name, String api_desc) {
//        this.api_id = api_id;
//        this.api_name = api_name;
//        this.api_desc = api_desc;
//    }
    public Long getApi_id() {
        return api_id;
    }
    public void setApi_id(Long api_id) {
        this.api_id = api_id;
    }
    public String getApi_name() {
        return api_name;
    }
    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }
    public String getApi_desc() {
        return api_desc;
    }
    public void setApi_desc(String api_desc) {
        this.api_desc = api_desc;
    }


    @Override
    public String toString() {
        return "CoolApi [api_id=" + api_id + ", api_name=" + api_name + ", api_desc=" + api_desc
                + "]";
    }


}
