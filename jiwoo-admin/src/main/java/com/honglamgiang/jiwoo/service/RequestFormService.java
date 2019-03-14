package com.honglamgiang.jiwoo.service;

import java.util.ArrayList;
import java.util.List;

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
        entity.setRequestFormType(requestFormModel.getRequestFormType());
        requestFormRepository.save(entity);
    }

    public void deleteRequestForm(Long requestFormId) {
        requestFormRepository.deleteById(requestFormId);
    }

    public RequestFormModel getRequestFormModelById(Long requestFormId) {
        RequestFormModel requestFormModel = new RequestFormModel();
        RequestForm requestFormEntity = requestFormRepository.findById(requestFormId).get();
        requestFormModel.setRequestFormId(requestFormEntity.getRequestFormId());
        requestFormModel.setCusName(requestFormEntity.getCusName());
        requestFormModel.setCusEmail(requestFormEntity.getCusEmail());
        requestFormModel.setCusPhoneNo(requestFormEntity.getCusPhoneNo());
        requestFormModel.setCusAddress(requestFormEntity.getCusAddress());
        requestFormModel.setCusIdentityNo(requestFormEntity.getCusIdentityNo());
        requestFormModel.setBankId(requestFormEntity.getBankId());
        requestFormModel.setBankAccountNo(requestFormEntity.getBankAccountNo());
        requestFormModel.setCashNumber(requestFormEntity.getCashNumber());
        requestFormModel.setIndentityImageFront(requestFormEntity.getIndentityImageFront());
        requestFormModel.setIndentityImageBack(requestFormEntity.getIndentityImageBack());
        requestFormModel.setSalaryImage(requestFormEntity.getSalaryImage());
        requestFormModel.setOtherDocImageUrl(requestFormEntity.getOtherDocImageUrl());
        requestFormModel.setRequestFormType(requestFormEntity.getRequestFormType());
        requestFormModel.setStatus(requestFormEntity.getStatus());
        return requestFormModel;
    }

    public List<RequestFormModel> findAllRequestForm() {
        List<RequestFormModel> returnList = new ArrayList<RequestFormModel>();
        List<RequestForm> listRequestForm = (List<RequestForm>)requestFormRepository.findAll();
        listRequestForm.forEach(entity->{
            RequestFormModel requestFormModel = new RequestFormModel();
            requestFormModel.setRequestFormId(entity.getRequestFormId());
            requestFormModel.setCusName(entity.getCusName());
            requestFormModel.setCusEmail(entity.getCusEmail());
            requestFormModel.setCusPhoneNo(entity.getCusPhoneNo());
            requestFormModel.setCusAddress(entity.getCusAddress());
            requestFormModel.setCusIdentityNo(entity.getCusIdentityNo());
            requestFormModel.setRequestFormType(entity.getRequestFormType());
            requestFormModel.setStatus(entity.getStatus());
            requestFormModel.setRequestFormTypeStr(
                                            entity.getRequestFormType() == 1 ? "Chuyển tiền"
                                            : entity.getRequestFormType() == 2 ? "Vay tiền"
                                            : entity.getRequestFormType() == 3 ? "Giấy tờ"
                                            : "Yêu cầu khác"
                                            );
            returnList.add(requestFormModel);
        });
        return returnList;
    }
}