package me.yekki.springcloud.env.test.controller;


import me.yekki.springcloud.env.test.service.UserService;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserVO> getUsers() {

        return userService.getUsers();
    }
}
