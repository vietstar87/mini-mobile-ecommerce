package com.honglamgiang.jiwoo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RequestFormModel {

    @JsonIgnore
    Long requestFormId;
    String cusName;
    String cusEmail;
    String cusPhoneNo;
    String cusAddress;
    String cusIdentityNo;
    Integer bankId;
    String bankAccountNo;
    Double cashNumber;
    String indentityImageFront;
    String indentityImageBack;
    String salaryImage;
    String otherDocImageUrl;
    Integer requestFormType;
    Integer status;
    @JsonIgnore
    String requestFormTypeStr;

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


    public Integer getBankId() {
        return this.bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankAccountNo() {
        return this.bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public Double getCashNumber() {
        return this.cashNumber;
    }

    public void setCashNumber(Double cashNumber) {
        this.cashNumber = cashNumber;
    }

    public String getIndentityImageFront() {
        return this.indentityImageFront;
    }

    public void setIndentityImageFront(String indentityImageFront) {
        this.indentityImageFront = indentityImageFront;
    }

    public String getIndentityImageBack() {
        return this.indentityImageBack;
    }

    public void setIndentityImageBack(String indentityImageBack) {
        this.indentityImageBack = indentityImageBack;
    }

    public String getSalaryImage() {
        return this.salaryImage;
    }

    public void setSalaryImage(String salaryImage) {
        this.salaryImage = salaryImage;
    }

    public String getOtherDocImageUrl() {
        return this.otherDocImageUrl;
    }

    public void setOtherDocImageUrl(String otherDocImageUrl) {
        this.otherDocImageUrl = otherDocImageUrl;
    }
    

    public Integer getRequestFormType() {
        return this.requestFormType;
    }

    public void setRequestFormType(Integer requestFormType) {
        this.requestFormType = requestFormType;
    }

    public String getRequestFormTypeStr() {
        return this.requestFormTypeStr;
    }

    public void setRequestFormTypeStr(String requestFormTypeStr) {
        this.requestFormTypeStr = requestFormTypeStr;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
}