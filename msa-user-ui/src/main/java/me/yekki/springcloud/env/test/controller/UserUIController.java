package me.yekki.springcloud.env.test.controller;

import me.yekki.springcloud.env.test.service.UserUIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserUIController {

    @Autowired
    private UserUIService userUIService;

    @GetMapping("/")
    public ModelAndView index(Model model) {

        model.addAttribute("users", userUIService.getUsers());
        return new ModelAndView("index", "model", model);
    }
}
