package me.yekki.springcloud.env.test.controller;

import me.yekki.springcloud.env.test.domain.User;
import me.yekki.springcloud.env.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/gen/{n}")
    public List<User> genUsers(@PathVariable("n")int n) {

        List<User> users = IntStream.range(0, n).mapToObj((i)-> new User("user" + i, "password", String.format("yekki%d@me.com", i))).collect(Collectors.toList());
        return userRepository.saveAll(users);
    }

    @GetMapping("/users/clean")
    public void cleanUsers() {
        userRepository.deleteAll();
    }

    @GetMapping("/users")
    public List<User> getUsers() {

        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@ModelAttribute User user) {

        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id) {

        return userRepository.findById(id).orElse(new User());
    }

    @DeleteMapping("/user/{id}")
    public void delUser(@PathVariable("id")Long id) {

        userRepository.deleteById(id);
    }

    @PutMapping("/user/{id}")
    public User editUser(@ModelAttribute User user) {

        User u = userRepository.findById(user.getId()).orElse(null);

        if (u != null) {
            u.setUsername(user.getUsername());
            u.setPassword(user.getPassword());
            u.setEmail(user.getEmail());
        }

        return u;
    }

    @GetMapping("/hello")
    public String sayHello() {

        return "hello world!";
    }
}
