package com.demo.controller.mariadb.popup;

import com.demo.service.mariadb.popup.ServiceMariadbPopupRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/mariadb/popup/action")
public class ControllerMariadbPopupAction {

    @Autowired
    private ServiceMariadbPopupRegister serviceMariadbPopupRegister;

    @PostMapping("/register")
    @ResponseBody
    public String register (@RequestBody Map<String, Object> jsonData) {

        /*
        // Map 다루기.
        String name = (String) jsonData.get("name");
        int age = (int) jsonData.get("age");
        */

        // todo 1) service 계층으로 데이터 전달.
        serviceMariadbPopupRegister.registerContent(jsonData);

        return "";
    }
}
