package com.tseong.gecmvc.model;

public class Person {
    private Integer pId;

    private Integer pIsmale;

    private String pEname;

    private String pCname;

    private String pHometown;

    private String pOccupation;

    private String pMobile;

    private String pQq;

    private String pWechat;

    private String pDistrict;

    private String pRemark;

    public Person(Integer pId, Integer pIsmale, String pEname, String pCname, String pHometown, String pOccupation, String pMobile, String pQq, String pWechat, String pDistrict, String pRemark) {
        this.pId = pId;
        this.pIsmale = pIsmale;
        this.pEname = pEname;
        this.pCname = pCname;
        this.pHometown = pHometown;
        this.pOccupation = pOccupation;
        this.pMobile = pMobile;
        this.pQq = pQq;
        this.pWechat = pWechat;
        this.pDistrict = pDistrict;
        this.pRemark = pRemark;
    }

    public Person() {
        super();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getpIsmale() {
        return pIsmale;
    }

    public void setpIsmale(Integer pIsmale) {
        this.pIsmale = pIsmale;
    }

    public String getpEname() {
        return pEname;
    }

    public void setpEname(String pEname) {
        this.pEname = pEname == null ? null : pEname.trim();
    }

    public String getpCname() {
        return pCname;
    }

    public void setpCname(String pCname) {
        this.pCname = pCname == null ? null : pCname.trim();
    }

    public String getpHometown() {
        return pHometown;
    }

    public void setpHometown(String pHometown) {
        this.pHometown = pHometown == null ? null : pHometown.trim();
    }

    public String getpOccupation() {
        return pOccupation;
    }

    public void setpOccupation(String pOccupation) {
        this.pOccupation = pOccupation == null ? null : pOccupation.trim();
    }

    public String getpMobile() {
        return pMobile;
    }

    public void setpMobile(String pMobile) {
        this.pMobile = pMobile == null ? null : pMobile.trim();
    }

    public String getpQq() {
        return pQq;
    }

    public void setpQq(String pQq) {
        this.pQq = pQq == null ? null : pQq.trim();
    }

    public String getpWechat() {
        return pWechat;
    }

    public void setpWechat(String pWechat) {
        this.pWechat = pWechat == null ? null : pWechat.trim();
    }

    public String getpDistrict() {
        return pDistrict;
    }

    public void setpDistrict(String pDistrict) {
        this.pDistrict = pDistrict == null ? null : pDistrict.trim();
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark == null ? null : pRemark.trim();
    }
}