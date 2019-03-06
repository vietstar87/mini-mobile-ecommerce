package com.honglamgiang.jiwoo.service;

import com.honglamgiang.jiwoo.enitty.RequestForm;
import com.honglamgiang.jiwoo.model.RequestFormModel;
import com.honglamgiang.jiwoo.repository.RequestFormRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RequestFormService
 */
@Service
public class RequestFormService {

    @Autowired
    RequestFormRepository requestFormRepository;

    public void addRequestForm(RequestFormModel requestFormModel) {
        RequestForm entity = new RequestForm();
        entity.setCusName(requestFormModel.getCusName());
        entity.setCusEmail(requestFormModel.getCusEmail());
        entity.setCusPhoneNo(requestFormModel.getCusPhoneNo());
        entity.setCusAddress(requestFormModel.getCusAddress());
        entity.setCusIdentityNo(requestFormModel.getCusIdentityNo());
        requestFormRepository.save(entity);
    }

    public void deleteRequestForm(Long requestFormId) {
        requestFormRepository.deleteById(requestFormId);
    }
}