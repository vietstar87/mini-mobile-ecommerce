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

    @Column(name="doc_image_url")
    String docImageUrl;

    @Column(name="request_form_type")
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