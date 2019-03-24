package com.honglamgiang.jiwoo.controller;

import java.util.List;

import com.honglamgiang.jiwoo.model.ImageData;
import com.honglamgiang.jiwoo.model.RequestFormModel;
import com.honglamgiang.jiwoo.service.RequestFormService;
import com.honglamgiang.jiwoo.service.UploadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestFormController
 */
@RestController
public class RequestFormController {
    @Autowired
    RequestFormService requestFormService;

    @Autowired
    UploadService uploadService;

    private final static Integer IDENTITY_FRONT_TYPE = 1;
    private final static Integer IDENTITY_BACK_TYPE = 2;
    private final static Integer PASSPORT_TYPE = 3;
    private final static Integer SALARY_TYPE = 4;
    private final static Integer BANK_ACCOUNT_TYPE = 5;
    private final static Integer OTHER_DOCS_TYPE = 6;

    @RequestMapping(value = "/getList", method=RequestMethod.GET)
    public List<RequestFormModel> getListRequestForm() {
        List<RequestFormModel> returnList = requestFormService.findAllRequestForm();
        return returnList;
    }

    @RequestMapping(value = "/transfer/{requestFormId}", method=RequestMethod.GET)
    public RequestFormModel getTransferDetail(@PathVariable("requestFormId") Long requestFormId) {
        RequestFormModel returnModel = requestFormService.getRequestFormModelById(requestFormId);
        return returnModel;
    }

    @RequestMapping(value = "/loan/{requestFormId}", method=RequestMethod.GET)
    public RequestFormModel getLoanDetail(@PathVariable("requestFormId") Long requestFormId) {
        RequestFormModel returnModel = requestFormService.getRequestFormModelById(requestFormId);
        return returnModel;
    }

    @RequestMapping(value = "/docs/{requestFormId}", method=RequestMethod.GET)
    public RequestFormModel getDocsDetail(@PathVariable("requestFormId") Long requestFormId) {
        RequestFormModel returnModel = requestFormService.getRequestFormModelById(requestFormId);
        return returnModel;
    }

    @RequestMapping(value = "/addRequestForm", method=RequestMethod.POST)
    public Long addRequestForm(@RequestBody RequestFormModel requestFormModel) {
        Long requestFormId = requestFormService.addRequestForm(requestFormModel);
        if(requestFormId != null && requestFormId > 0){
            return requestFormId;
        }else{
            return -1L;
        } 
    }

    @RequestMapping(value = "/uploadImage", method=RequestMethod.POST)
    public String uploadImage(@RequestBody ImageData imageData) {
        RequestFormModel requestFormModel = requestFormService.getRequestFormModelById(imageData.getRequestFormId());
        String fileName = "";
        String path = "/jiwoo/upload/";
        if(imageData.getImageType().equals(IDENTITY_FRONT_TYPE)){
            fileName = "intdentity_front_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setIndentityImageFront(path+fileName);
        }else if(imageData.getImageType().equals(IDENTITY_BACK_TYPE)){
            fileName = "intdentity_back_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setIndentityImageBack(path+fileName);
        }else if(imageData.getImageType().equals(PASSPORT_TYPE)){
            fileName = "passport_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setPassportImage(path+fileName);
        }else if(imageData.getImageType().equals(BANK_ACCOUNT_TYPE)){
            fileName = "bank_account_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setBankAccountImage(path+fileName);
        }else if(imageData.getImageType().equals(SALARY_TYPE)){
            fileName = "salary_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setSalaryImage(path+fileName);
        }else if(imageData.getImageType().equals(OTHER_DOCS_TYPE)){
            fileName = "other_"+imageData.getRequestFormId()+".jpg";
            requestFormModel.setOtherDocImage(path+fileName);
        }

        Boolean uploadSuccess = uploadService.convertBase64StringToImage(imageData.getBase64data(), fileName);
        if(uploadSuccess){
            requestFormService.editRequestForm(requestFormModel);
            return fileName;
        }else{
            return null;
        }
    }

    @RequestMapping(value = "/editRequestForm", method=RequestMethod.POST)
    public Long updateRequestForm(@RequestBody RequestFormModel requestFormModel) {
        Long requestFormId = requestFormService.editRequestForm(requestFormModel);
        if(requestFormId != null && requestFormId > 0){
            return requestFormId;
        }else{
            return -1L; 
        }
        
    }
}