package com.honglamgiang.jiwoo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RequestFormModel {

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
    String indentityImageFrontData;

    String indentityImageBack;
    String indentityImageBackData;

    String salaryImage;
    String salaryImageData;

    String passportImage;
    String passportImageData;

    String bankAccountImage;
    String bankAccountImageData;

    String otherDocImage;
    String otherDocImageData;

    Integer requestFormType;
    Integer status;
    String reason;
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

    public String getOtherDocImage() {
        return this.otherDocImage;
    }

    public void setOtherDocImage(String otherDocImage) {
        this.otherDocImage = otherDocImage;
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

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOtherDocImageData() {
        return this.otherDocImageData;
    }

    public void setOtherDocImageData(String otherDocImageData) {
        this.otherDocImageData = otherDocImageData;
    }

    public String getIndentityImageFrontData() {
        return this.indentityImageFrontData;
    }

    public void setIndentityImageFrontData(String indentityImageFrontData) {
        this.indentityImageFrontData = indentityImageFrontData;
    }

    public String getIndentityImageBackData() {
        return this.indentityImageBackData;
    }

    public void setIndentityImageBackData(String indentityImageBackData) {
        this.indentityImageBackData = indentityImageBackData;
    }

    public String getSalaryImageData() {
        return this.salaryImageData;
    }

    public void setSalaryImageData(String salaryImageData) {
        this.salaryImageData = salaryImageData;
    }

    public String getPassportImage() {
        return this.passportImage;
    }

    public void setPassportImage(String passportImage) {
        this.passportImage = passportImage;
    }

    public String getPassportImageData() {
        return this.passportImageData;
    }

    public void setPassportImageData(String passportImageData) {
        this.passportImageData = passportImageData;
    }

    public String getBankAccountImage() {
        return this.bankAccountImage;
    }

    public void setBankAccountImage(String bankAccountImage) {
        this.bankAccountImage = bankAccountImage;
    }

    public String getBankAccountImageData() {
        return this.bankAccountImageData;
    }

    public void setBankAccountImageData(String bankAccountImageData) {
        this.bankAccountImageData = bankAccountImageData;
    }
    
}