package me.yekki.springcloud.env.test.controller;


import me.yekki.springcloud.env.test.service.UserHystrixClient;
import me.yekki.springcloud.env.test.vo.ResultVO;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserHystrixClient userService;

    @GetMapping("/users")
    public ResultVO<List<UserVO>> getUsers() {

        return userService.getUsers();
    }
}
