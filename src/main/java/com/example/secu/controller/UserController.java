package com.example.secu.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // TODO /registration

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(Authentication authentication, Model out) {

        out.addAttribute("userName", authentication.getName());

        return "welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    // "/login" POST controller is provided by Spring Security!
}
