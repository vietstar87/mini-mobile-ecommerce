package com.honglamgiang.jiwoo.model;

public class RequestFormModel {

    Long requestFormId;
    String cusName;
    String cusEmail;
    String cusPhoneNo;
    String cusAddress;
    String cusIdentityNo;
    String docImageUrl;
    String requestFormType;

    public Long getRequestFormId() {
        return this.requestFormId;
    }

    public void setRequestFormId(Long requestFormId) {
        this.requestFormId = requestFormId;
    }

    public String getCusName() {
        return this.cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return this.cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhoneNo() {
        return this.cusPhoneNo;
    }

    public void setCusPhoneNo(String cusPhoneNo) {
        this.cusPhoneNo = cusPhoneNo;
    }

    public String getCusAddress() {
        return this.cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusIdentityNo() {
        return this.cusIdentityNo;
    }

    public void setCusIdentityNo(String cusIdentityNo) {
        this.cusIdentityNo = cusIdentityNo;
    }

    public String getDocImageUrl() {
        return this.docImageUrl;
    }

    public void setDocImageUrl(String docImageUrl) {
        this.docImageUrl = docImageUrl;
    }

    public String getRequestFormType() {
        return this.requestFormType;
    }

    public void setRequestFormType(String requestFormType) {
        this.requestFormType = requestFormType;
    }
    
}