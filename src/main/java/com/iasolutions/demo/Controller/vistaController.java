package com.iasolutions.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class vistaController {

    @GetMapping("/home")
    public String homePage() {
        return "inicio";
    }

    @GetMapping("/sesion")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "adminPage";
    }
}
