package ua.com.vseprav.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String index(){
        return "views/login";
    }
}