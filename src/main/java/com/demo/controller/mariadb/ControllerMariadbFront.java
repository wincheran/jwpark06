package com.demo.controller.mariadb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mariadb/front")
public class ControllerMariadbFront {

    @GetMapping("/list")
    public String list() {
        return "mariadb/list";
    }
}
