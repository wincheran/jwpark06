package com.demo.controller.mariadb.popup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mariadb/popup/front")
public class controllerMariadbPopupFront {

    @GetMapping("/write")
    public String write() {
        return "mariadb/popup/write";
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
