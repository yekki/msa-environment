package me.yekki.springcloud.env.test.service.impl;

import me.yekki.springcloud.env.test.domain.User;
import me.yekki.springcloud.env.test.repository.UserRepository;
import me.yekki.springcloud.env.test.service.UserService;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserVO> genUsers(int n) {

        List<User> users = IntStream.range(0, n).mapToObj((i)-> new User("user" + i, "password", String.format("yekki%d@me.com", i))).collect(Collectors.toList());
        return userRepository.saveAll(users).stream().map(u->u.toDTO()).collect(Collectors.toList());
    }

    public void cleanUsers() {
        userRepository.deleteAll();
    }

    public List<UserVO> getUsers() {
        return userRepository.findAll().stream().map(u-> u.toDTO()).collect(Collectors.toList());
    }

    public UserVO createUser(UserVO user) {

        userRepository.save(new User(user));

        return user;
    }

    public UserVO getUser(Long id) {

        return userRepository.findById(id).orElse(new User()).toDTO();
    }

    public void delUser(Long id) {

        userRepository.deleteById(id);
    }

    public void delAll() {

        userRepository.deleteAll();
    }

    public UserVO editUser(UserVO user) {

        return userRepository.findById(user.getId()).orElse(null).toDTO();
    }
}
