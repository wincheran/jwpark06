package com.demo.controller.mariadb.popup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mariadb/popup/front")
public class ControllerMariadbPopupFront {

    @GetMapping("/register")
    public String register() {
        return "mariadb/popup/register";
    }

    @GetMapping("/delete")
    public String delete() {
        return "mariadb/popup/delete";
    }

    @GetMapping("/update")
    public String update() {
        return "mariadb/popup/update";
    }
}
