package com.tseong.gecmvc.model;

public class GroupDone {
    private Integer gId;

    private Integer gAid;

    private Integer gPid;

    private String gRole;

    private Integer gWithPid;

    private Integer gNo;

    private String gLanguage;

    private String gName;

    private Integer gFixed;

    private String gRemark;

    public GroupDone(Integer gId, Integer gAid, Integer gPid, String gRole, Integer gWithPid, Integer gNo, String gLanguage, String gName, Integer gFixed, String gRemark) {
        this.gId = gId;
        this.gAid = gAid;
        this.gPid = gPid;
        this.gRole = gRole;
        this.gWithPid = gWithPid;
        this.gNo = gNo;
        this.gLanguage = gLanguage;
        this.gName = gName;
        this.gFixed = gFixed;
        this.gRemark = gRemark;
    }

    public GroupDone() {
        super();
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getgAid() {
        return gAid;
    }

    public void setgAid(Integer gAid) {
        this.gAid = gAid;
    }

    public Integer getgPid() {
        return gPid;
    }

    public void setgPid(Integer gPid) {
        this.gPid = gPid;
    }

    public String getgRole() {
        return gRole;
    }

    public void setgRole(String gRole) {
        this.gRole = gRole == null ? null : gRole.trim();
    }

    public Integer getgWithPid() {
        return gWithPid;
    }

    public void setgWithPid(Integer gWithPid) {
        this.gWithPid = gWithPid;
    }

    public Integer getgNo() {
        return gNo;
    }

    public void setgNo(Integer gNo) {
        this.gNo = gNo;
    }

    public String getgLanguage() {
        return gLanguage;
    }

    public void setgLanguage(String gLanguage) {
        this.gLanguage = gLanguage == null ? null : gLanguage.trim();
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getgFixed() {
        return gFixed;
    }

    public void setgFixed(Integer gFixed) {
        this.gFixed = gFixed;
    }

    public String getgRemark() {
        return gRemark;
    }

    public void setgRemark(String gRemark) {
        this.gRemark = gRemark == null ? null : gRemark.trim();
    }
}