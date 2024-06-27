package com.contact.learnspringsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleWelcome(){
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome(){
        return "admin/home";
    }

    @GetMapping("/user/home")
    public  String hadleUserHome(){
        return "user/home";
    }

    @GetMapping("/login")
    public String handleLog(){
        return "custom_login";
    }
}
