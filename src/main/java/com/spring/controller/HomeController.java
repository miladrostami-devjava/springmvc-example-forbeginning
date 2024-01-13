package com.spring.controller;


import com.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@RequestMapping("/api")
public class HomeController {

@RequestMapping(value = "/home" ,method = RequestMethod.GET)
public String home(Locale locale, Model model){
    System.out.println("Home Page Requested , locale is ::" + locale);
    Date date = new Date();
    DateFormat dateFormat = DateFormat
            .getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
    String dateFormatted = dateFormat.format(date);
model.addAttribute("serverMilad",dateFormatted);

    return "home";
}

@RequestMapping(value = "/user",method = RequestMethod.POST)
public String user(@Validated User user, Model model){
    System.out.println("User Page Requested!");
    model.addAttribute("userName",user.getUserName());


    return "user";
}

}
