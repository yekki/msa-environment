package me.yekki.springcloud.env.test.controller;

import me.yekki.springcloud.env.test.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppProperties appProperties;

    @GetMapping("/app")
    public String echo() {

        return String.format("Author: %s, Email: %s", appProperties.getAuthor(), appProperties.getEmail());
    }
}
