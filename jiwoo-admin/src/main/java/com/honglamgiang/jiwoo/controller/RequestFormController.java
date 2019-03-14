package com.honglamgiang.jiwoo.controller;

import java.util.List;

import com.honglamgiang.jiwoo.model.RequestFormModel;
import com.honglamgiang.jiwoo.service.RequestFormService;

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
    public String addRequestForm(@RequestBody RequestFormModel requestFormModel) {
        requestFormService.addRequestForm(requestFormModel);
        return "Thêm mới bản ghi thành công";
    }

}