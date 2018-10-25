package me.yekki.springcloud.env.test.controller;

import me.yekki.springcloud.env.test.service.UserService;
import me.yekki.springcloud.env.test.vo.ResultVO;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/gen/{n}")
    public ResultVO<List<UserVO>> genUsers(@PathVariable("n") int n) {

        return ResultVO.success(userService.genUsers(n));
    }


    @GetMapping("/users/clean")
    public void cleanUsers() {

        userService.delAll();
    }

    @GetMapping("/users")
    public ResultVO<List<UserVO>> getUsers() {

        return ResultVO.success(userService.getUsers());
    }

    @PostMapping("/users")
    public ResultVO createUser(@ModelAttribute UserVO user) {

        return ResultVO.success(userService.createUser(user));
    }

    @GetMapping("/user/{id}")
    public ResultVO<UserVO> getUser(@PathVariable("id") Long id) {

        return ResultVO.success(userService.getUser(id));
    }

    @DeleteMapping("/user/{id}")
    public void delUser(@PathVariable("id") Long id) {
        userService.delUser(id);
    }

    @PutMapping("/user/{id}")
    public ResultVO<UserVO> editUser(@ModelAttribute UserVO user) {

        return ResultVO.success(userService.editUser(user));
    }

    @GetMapping("/echo")
    public String echo() {

        return "echo hello world!";
    }
}
