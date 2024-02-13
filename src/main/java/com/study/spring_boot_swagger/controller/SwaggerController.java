package com.study.spring_boot_swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {

    @GetMapping("/swagger")
    public String getSwagger(){
         return "redirect:/swagger-ui/index.html";
    }

}
