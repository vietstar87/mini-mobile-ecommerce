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
 * Bank
 */
@Entity
@Table(name="bank")
@NamedQuery(name="Bank.findAll", query="SELECT b FROM Bank b")
public class Bank implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="bank_id")
    private Long bankId;

    @Column(name="bank_name")
    private String bankName;


    public Long getBankId() {
        return this.bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}