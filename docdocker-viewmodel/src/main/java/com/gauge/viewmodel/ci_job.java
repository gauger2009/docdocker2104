package com.gauge.viewmodel;
import java.io.Serializable;

@SuppressWarnings("serial")
public class ci_job {
    private String key_id;
    private String job_name;
    private String project_path;
    private String copy_name;
    private int update_value;
    private String remote_url;
    private int build_order;
    private boolean is_active;
    private String project_by;

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getProject_path() {
        return project_path;
    }

    public void setProject_path(String project_path) {
        this.project_path = project_path;
    }

    public String getCopy_name() {
        return copy_name;
    }

    public void setCopy_name(String copy_name) {
        this.copy_name = copy_name;
    }

    public int getUpdate_value() {
        return update_value;
    }

    public void setUpdate_value(int update_value) {
        this.update_value = update_value;
    }

    public String getRemote_url() {
        return remote_url;
    }

    public void setRemote_url(String remote_url) {
        this.remote_url = remote_url;
    }

    public int getBuild_order() {
        return build_order;
    }

    public void setBuild_order(int build_order) {
        this.build_order = build_order;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getProject_by() {
        return project_by;
    }

    public void setProject_by(String project_by) {
        this.project_by = project_by;
    }

    @Override
    public String toString() {
        return "ci_job{" +
                "key_id='" + key_id + '\'' +
                ", job_name='" + job_name + '\'' +
                ", project_path='" + project_path + '\'' +
                ", copy_name='" + copy_name + '\'' +
                ", update_value=" + update_value +
                ", remote_url='" + remote_url + '\'' +
                ", build_order=" + build_order +
                ", is_active=" + is_active +
                ", project_by='" + project_by + '\'' +
                '}';
    }

}
