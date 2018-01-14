package com.tseong.gecmvc.model;

import java.util.Date;

public class Activity {
    private Integer aId;

    private Date aLaunchtime;

    private String aName;

    private String aRemark;

    public Activity(Integer aId, Date aLaunchtime, String aName, String aRemark) {
        this.aId = aId;
        this.aLaunchtime = aLaunchtime;
        this.aName = aName;
        this.aRemark = aRemark;
    }

    public Activity() {
        super();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Date getaLaunchtime() {
        return aLaunchtime;
    }

    public void setaLaunchtime(Date aLaunchtime) {
        this.aLaunchtime = aLaunchtime;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaRemark() {
        return aRemark;
    }

    public void setaRemark(String aRemark) {
        this.aRemark = aRemark == null ? null : aRemark.trim();
    }
}