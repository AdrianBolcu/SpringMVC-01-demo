package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Mindit on 12/28/2017.
 */
@Controller

public class StudentAdmissionController {
    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
        ModelAndView model1 = new ModelAndView("AdmissionForm");
        return model1;
    }
    @ModelAttribute
    public void addingComonObjects(Model model1){
        model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
    }

    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
        if(result.hasErrors()){
            ModelAndView model1 = new ModelAndView("AdmissionForm");
            return model1;
        }

        ModelAndView model1 = new ModelAndView("AdmissionSuccess");
        return model1;
    }


}
