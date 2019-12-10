package com.files.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {

    @RequestMapping("/")
    public String view() {
        return "500";
    }

}
