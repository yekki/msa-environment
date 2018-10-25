package me.yekki.springcloud.env.test.controller;

import me.yekki.springcloud.env.test.domain.User;
import me.yekki.springcloud.env.test.service.UserService;
import me.yekki.springcloud.env.test.vo.JsonResponse;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/gen/{n}")
    public JsonResponse<UserVO> genUsers(@PathVariable("n") int n) {

        JsonResponse<UserVO> resp = JsonResponse.ok();
        resp.setData(userService.genUsers(n));
        return resp;
    }


    @GetMapping("/users/clean")
    public JsonResponse<UserVO> cleanUsers() {

        userService.delAll();
        return JsonResponse.ok();
    }

    @GetMapping("/users")
    public JsonResponse<UserVO> getUsers() {
        JsonResponse<UserVO> resp = JsonResponse.ok();
        resp.setData(userService.getUsers());
        return resp;
    }

    @PostMapping("/users")
    public JsonResponse createUser(@ModelAttribute UserVO user) {

        JsonResponse<UserVO> resp = JsonResponse.ok();
        resp.setData(userService.createUser(user));

        return resp;
    }

    @GetMapping("/user/{id}")
    public JsonResponse<UserVO> getUser(@PathVariable("id") Long id) {

        JsonResponse<UserVO> resp = JsonResponse.ok();
        resp.setData(userService.editUser(userService.getUser(id)));
        return resp;
    }

    @DeleteMapping("/user/{id}")
    public JsonResponse<UserVO> delUser(@PathVariable("id") Long id) {
        userService.delUser(id);
        return JsonResponse.ok();
    }

    @PutMapping("/user/{id}")
    public JsonResponse<UserVO> editUser(@ModelAttribute UserVO user) {

        JsonResponse<UserVO> resp = JsonResponse.ok();
        resp.setData(userService.editUser(user));
        return resp;
    }

    @GetMapping("/hello")
    public String sayHello() {

        return "hello world!";
    }
}
