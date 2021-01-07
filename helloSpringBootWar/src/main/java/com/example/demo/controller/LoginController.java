package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("")
    public String home() {
        return "index";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        String loginName = request.getParameter("loginName");
        model.addAttribute("message", "你好，" + loginName);
        return "hello";
    }
}
