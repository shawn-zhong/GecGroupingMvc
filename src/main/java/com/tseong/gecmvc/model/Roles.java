package com.tseong.gecmvc.model;

public class Roles {
    private Integer rId;

    private Integer rAid;

    private String rName;

    private String rPriority;

    public Roles(Integer rId, Integer rAid, String rName, String rPriority) {
        this.rId = rId;
        this.rAid = rAid;
        this.rName = rName;
        this.rPriority = rPriority;
    }

    public Roles() {
        super();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getrAid() {
        return rAid;
    }

    public void setrAid(Integer rAid) {
        this.rAid = rAid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrPriority() {
        return rPriority;
    }

    public void setrPriority(String rPriority) {
        this.rPriority = rPriority == null ? null : rPriority.trim();
    }
}