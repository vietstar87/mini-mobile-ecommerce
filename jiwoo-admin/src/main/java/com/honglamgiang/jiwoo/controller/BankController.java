package com.honglamgiang.jiwoo.controller;

import com.honglamgiang.jiwoo.model.BankModel;
import com.honglamgiang.jiwoo.service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * BankController
 */
@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @RequestMapping(value = "/bank/add", method=RequestMethod.POST)
    public Long addBank(@RequestBody BankModel bankModel) {
        Long bankId = bankService.addBank(bankModel);
        if(bankId != null && bankId > 0){
            return bankId;
        }else{
            return -1L; 
        }
    }

    @RequestMapping(value = "/bank/edit", method=RequestMethod.POST)
    public Long editBank(@RequestBody BankModel bankModel) {
        Long bankId = bankService.editBank(bankModel);
        if(bankId != null && bankId > 0){
            return bankId;
        }else{
            return -1L; 
        }
    }

    @RequestMapping(value = "/bank/delete/{bankId}", method=RequestMethod.POST)
    public Boolean deleteBank(@PathVariable Long bankId) {
        Boolean deleteSuccess = bankService.deleteBank(bankId);
        return deleteSuccess;
    }

    @RequestMapping(value = "/bank/{bankId}", method=RequestMethod.GET)
    public BankModel getBankById(@PathVariable Long bankId) {
        BankModel bankModel = bankService.getBankById(bankId);
        return bankModel;
    }
}