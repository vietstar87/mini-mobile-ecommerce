package com.honglamgiang.jiwoo.enitty;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * RequestForm
 */
@Entity
@Table(name="request_form")
@NamedQuery(name="RequestForm.findAll", query="SELECT r FROM RequestForm r")
public class RequestForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="request_form_id")
    Long requestFormId;

    @Column(name="cus_name")
    String cusName;

    @Column(name="cus_email")
    String cusEmail;

    @Column(name="cus_phone_no")
    String cusPhoneNo;

    @Column(name="cus_address")
    String cusAddress;

    @Column(name="cus_identity_no")
    String cusIdentityNo;

    @Column(name="bank_id")
    Integer bankId;

    @Column(name="bank_account_no")
    String bankAccountNo;

    @Column(name="cash_number")
    Double cashNumber;

    @Column(name="indentity_image_front")
    String indentityImageFront;

    @Column(name="indentity_image_back")
    String indentityImageBack;

    @Column(name="salary_image")
    String salaryImage;

    @Column(name="other_doc_image_url")
    String otherDocImageUrl;

    @Column(name="request_form_type")
    Integer requestFormType;

    @Column(name="status")
    Integer status;


    
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

    public Integer getRequestFormType() {
        return this.requestFormType;
    }

    public void setRequestFormType(Integer requestFormType) {
        this.requestFormType = requestFormType;
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

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
}