package com.honglamgiang.jiwoo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.honglamgiang.jiwoo.model.RequestFormModel;
import com.honglamgiang.jiwoo.service.RequestFormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * MainController
 */
@Controller
public class MainController {

    @Autowired
    RequestFormService requestFormService;

    @Autowired
    HttpSession session;

    private final Integer TRANSFER_TYPE = 1;
    private final Integer LOAN_TYPE = 2;
    private final Integer DOCS_TYPE = 3;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
        if(checkLogin()){
            List<RequestFormModel> listRequestFormModel = requestFormService.findAllRequestForm();
            model.addAttribute("listRequestFormModel", listRequestFormModel);
            return "index";
        }else{
            return "redirect:/login";
        }
        
    }

    @RequestMapping(value="/transfer", method=RequestMethod.GET)
    public String transfer(Model model) {
        if(checkLogin()){
            List<RequestFormModel> listTransferFormModel = new ArrayList<>(); 
            List<RequestFormModel> listRequestFormModel = requestFormService.findAllRequestForm();
            listRequestFormModel.forEach(item->{
                if(item.getRequestFormType().equals(TRANSFER_TYPE)){
                    listTransferFormModel.add(item);
                }
            });
            model.addAttribute("listTransferFormModel", listTransferFormModel);
            return "transfer";
        }else{
            return "redirect:/login";
        }
        
    }

    @RequestMapping(value="/loan", method=RequestMethod.GET)
    public String loan(Model model) {
        if(checkLogin()){
            List<RequestFormModel> listLoanFormModel = new ArrayList<>();
            List<RequestFormModel> listRequestFormModel = requestFormService.findAllRequestForm();
            listRequestFormModel.forEach(item->{
                if(item.getRequestFormType().equals(LOAN_TYPE)){
                    listLoanFormModel.add(item);
                }
            });
        model.addAttribute("listLoanFormModel", listLoanFormModel);
        return "loan";
        }else{
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/docs", method=RequestMethod.GET)
    public String docs(Model model) {
        if(checkLogin()){
            List<RequestFormModel> listDocsFormModel = new ArrayList<>();
            List<RequestFormModel> listRequestFormModel = requestFormService.findAllRequestForm();
            listRequestFormModel.forEach(item->{
                if(item.getRequestFormType().equals(DOCS_TYPE)){
                    listDocsFormModel.add(item);
                }
            });
            model.addAttribute("listDocsFormModel", listDocsFormModel);
            return "docs";
        }else{
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logout() {
        session.invalidate();
		return "redirect:/login";
    }

    @RequestMapping(value="/loginProcess", method=RequestMethod.POST)
    public String loginProcess(@RequestParam("username") String username, @RequestParam("password") String password) {
        if(username.equals("admin") && password.equals("123")){
            session.setAttribute("username", username);
            return "redirect:/";
        }else{
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/insert", method=RequestMethod.GET)
    public String insert(Model model) {
        model.addAttribute("requestFormModel", new RequestFormModel());
        return "insert";
    }

    private Boolean checkLogin(){
        String username = (String)session.getAttribute("username");
        if(username != null && !username.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}