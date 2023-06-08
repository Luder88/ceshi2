package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author css
 * @create 2023/5/31
 */
@Controller
public class Hello2Controller {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("msg", "Hello World!");
        return "hello";
    }
}
