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

    public Long addRequestForm(RequestFormModel requestFormModel) {
        RequestForm entity = new RequestForm();
        entity.setCusName(requestFormModel.getCusName());
        entity.setCusEmail(requestFormModel.getCusEmail());
        entity.setCusPhoneNo(requestFormModel.getCusPhoneNo());
        entity.setCusAddress(requestFormModel.getCusAddress());
        entity.setCusIdentityNo(requestFormModel.getCusIdentityNo());
        entity.setBankId(requestFormModel.getBankId());
        entity.setBankAccountNo(requestFormModel.getBankAccountNo());
        entity.setCashNumber(requestFormModel.getCashNumber());
        entity.setRequestFormType(requestFormModel.getRequestFormType());
        entity.setIndentityImageFront(requestFormModel.getIndentityImageFront());
        entity.setIndentityImageBack(requestFormModel.getIndentityImageBack());
        entity.setPassportImage(requestFormModel.getPassportImage());
        entity.setSalaryImage(requestFormModel.getSalaryImage());
        entity.setBankAccountImage(requestFormModel.getBankAccountImage());
        entity.setOtherDocImage(requestFormModel.getOtherDocImage());
        entity.setStatus(0);
        RequestForm requestFormAdded = requestFormRepository.save(entity);
        return requestFormAdded.getRequestFormId();
    }

    public Long editRequestForm(RequestFormModel requestFormModel) {
        RequestForm entity =  requestFormRepository.findById(requestFormModel.getRequestFormId()).get();
        entity.setCusName(requestFormModel.getCusName() != null ? requestFormModel.getCusName() : entity.getCusName());
        entity.setCusEmail(requestFormModel.getCusEmail() != null ? requestFormModel.getCusEmail() : entity.getCusEmail());
        entity.setCusPhoneNo(requestFormModel.getCusPhoneNo() != null ? requestFormModel.getCusPhoneNo() : entity.getCusPhoneNo());
        entity.setCusAddress(requestFormModel.getCusAddress() != null ? requestFormModel.getCusAddress() : entity.getCusAddress());
        entity.setCusIdentityNo(requestFormModel.getCusIdentityNo() != null ? requestFormModel.getCusIdentityNo() : entity.getCusIdentityNo());
        entity.setBankId(requestFormModel.getBankId() != null ? requestFormModel.getBankId() : entity.getBankId());
        entity.setBankAccountNo(requestFormModel.getBankAccountNo() != null ? requestFormModel.getBankAccountNo() : entity.getBankAccountNo());
        entity.setCashNumber(requestFormModel.getCashNumber() != null ? requestFormModel.getCashNumber() : entity.getCashNumber());
        entity.setRequestFormType(requestFormModel.getRequestFormType() != null ? requestFormModel.getRequestFormType() : entity.getRequestFormType());
        entity.setIndentityImageFront(requestFormModel.getIndentityImageFront() != null ? requestFormModel.getIndentityImageFront() : entity.getIndentityImageFront());
        entity.setIndentityImageBack(requestFormModel.getIndentityImageBack() != null ? requestFormModel.getIndentityImageBack() : entity.getIndentityImageBack());
        entity.setPassportImage(requestFormModel.getPassportImage() != null ? requestFormModel.getPassportImage() : entity.getPassportImage());
        entity.setSalaryImage(requestFormModel.getSalaryImage() != null ? requestFormModel.getSalaryImage() : entity.getSalaryImage());
        entity.setBankAccountImage(requestFormModel.getBankAccountImage() != null ? requestFormModel.getBankAccountImage() : entity.getBankAccountImage());
        entity.setOtherDocImage(requestFormModel.getOtherDocImage() != null ? requestFormModel.getOtherDocImage() : entity.getOtherDocImage());
        entity.setStatus( (requestFormModel.getStatus() != null && requestFormModel.getStatus() != 0) ? requestFormModel.getStatus() : entity.getStatus());
        entity.setReason(requestFormModel.getReason() != null ? requestFormModel.getReason() : entity.getReason());
        RequestForm requestFormUpdated = requestFormRepository.save(entity);
        return requestFormUpdated.getRequestFormId();
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
        requestFormModel.setPassportImage(requestFormEntity.getPassportImage());
        requestFormModel.setSalaryImage(requestFormEntity.getSalaryImage());
        requestFormModel.setBankAccountImage(requestFormEntity.getBankAccountImage());
        requestFormModel.setOtherDocImage(requestFormEntity.getOtherDocImage());
        requestFormModel.setRequestFormType(requestFormEntity.getRequestFormType());
        requestFormModel.setStatus(requestFormEntity.getStatus());
        requestFormModel.setReason(requestFormEntity.getReason());
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