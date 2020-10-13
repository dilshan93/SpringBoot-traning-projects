package com.dilshan.configconsumer.configconsumer.controller;

import com.dilshan.configconsumer.configconsumer.model.UserProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {

    @Autowired
    UserProfileConfiguration userProfileConfiguration;

    @RequestMapping("/profile")
    public String getUserProfileConfiguration(Model model){

        model.addAttribute("model", userProfileConfiguration.getDefaultModel());
        model.addAttribute("min", userProfileConfiguration.getMinRentPeriod());
        return "uprofile";
    }
}
