package com.tseong.gecmvc.model;

public class GroupWill {
    private Integer wId;

    private Integer wAid;

    private Integer wPid;

    private String wLanguage;

    private Integer wExperience;

    private String wRole;

    private String wBewith;

    private String wRemark;

    public GroupWill(Integer wId, Integer wAid, Integer wPid, String wLanguage, Integer wExperience, String wRole, String wBewith, String wRemark) {
        this.wId = wId;
        this.wAid = wAid;
        this.wPid = wPid;
        this.wLanguage = wLanguage;
        this.wExperience = wExperience;
        this.wRole = wRole;
        this.wBewith = wBewith;
        this.wRemark = wRemark;
    }

    public GroupWill() {
        super();
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Integer getwAid() {
        return wAid;
    }

    public void setwAid(Integer wAid) {
        this.wAid = wAid;
    }

    public Integer getwPid() {
        return wPid;
    }

    public void setwPid(Integer wPid) {
        this.wPid = wPid;
    }

    public String getwLanguage() {
        return wLanguage;
    }

    public void setwLanguage(String wLanguage) {
        this.wLanguage = wLanguage == null ? null : wLanguage.trim();
    }

    public Integer getwExperience() {
        return wExperience;
    }

    public void setwExperience(Integer wExperience) {
        this.wExperience = wExperience;
    }

    public String getwRole() {
        return wRole;
    }

    public void setwRole(String wRole) {
        this.wRole = wRole == null ? null : wRole.trim();
    }

    public String getwBewith() {
        return wBewith;
    }

    public void setwBewith(String wBewith) {
        this.wBewith = wBewith == null ? null : wBewith.trim();
    }

    public String getwRemark() {
        return wRemark;
    }

    public void setwRemark(String wRemark) {
        this.wRemark = wRemark == null ? null : wRemark.trim();
    }
}