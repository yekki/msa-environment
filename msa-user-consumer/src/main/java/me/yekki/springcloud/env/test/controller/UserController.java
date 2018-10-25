package me.yekki.springcloud.env.test.controller;


import me.yekki.springcloud.env.test.service.UserHystrixClient;
import me.yekki.springcloud.env.test.vo.JsonResponse;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserHystrixClient userService;

    @GetMapping("/users")
    public JsonResponse<UserVO> getUsers() {

        return userService.getUsers();
    }
}
