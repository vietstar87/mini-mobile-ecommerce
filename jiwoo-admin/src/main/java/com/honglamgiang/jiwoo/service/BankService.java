package com.honglamgiang.jiwoo.service;

import java.util.ArrayList;
import java.util.List;

import com.honglamgiang.jiwoo.enitty.Bank;
import com.honglamgiang.jiwoo.model.BankModel;
import com.honglamgiang.jiwoo.repository.BankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BankService
 */
@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;
    
    public List<BankModel> getAllBank() {
        List<BankModel> returnList = new ArrayList<BankModel>();
        List<Bank> listBankEnity = (List<Bank>)bankRepository.findAll();
        listBankEnity.forEach(entity->{
            BankModel bankModel = new BankModel();
            bankModel.setBankId(entity.getBankId());
            bankModel.setBankName(entity.getBankName());
            returnList.add(bankModel);
        });
        return returnList;
    }

    public BankModel getBankById(Long bankId) {
        BankModel returnModel = new BankModel();
        Bank bankEnity = bankRepository.findById(bankId).get();
        returnModel.setBankId(bankEnity.getBankId());
        returnModel.setBankName(bankEnity.getBankName());
        return returnModel;
    }

    public Long addBank(BankModel bankModel) {
        Bank bankEnity = new Bank();
        bankEnity.setBankName(bankModel.getBankName() != null ? bankModel.getBankName() : bankEnity.getBankName());
        Bank bankEnitySaved = bankRepository.save(bankEnity);
        return bankEnitySaved.getBankId();
    }

    public Long editBank(BankModel bankModel) {
        Bank bankEnity = bankRepository.findById(bankModel.getBankId()).get();
        bankEnity.setBankName(bankModel.getBankName() != null ? bankModel.getBankName() : bankEnity.getBankName());
        Bank bankEnitySaved = bankRepository.save(bankEnity);
        return bankEnitySaved.getBankId();
    }

    public Boolean deleteBank(Long bankId) {
        try {
            bankRepository.deleteById(bankId);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}