package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/front")
public class ControllerFront {

    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("testObject", 300);
        return "index";
    }

    @GetMapping("/showData")
    @ResponseBody
    public String showData() {
        return "HTTP Response Body를 통한 출력 방식";
    }

    @GetMapping("/testPage2")
    public String testPage() {
        return "testPage2";
    }
}
