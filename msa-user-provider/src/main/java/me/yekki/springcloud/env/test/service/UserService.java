package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<UserVO> genUsers(int n);

    void cleanUsers();

    List<UserVO> getUsers();

    UserVO createUser(UserVO user);

    UserVO getUser(Long id);

    void delUser(Long id);

    UserVO editUser(UserVO user);

    void delAll();
}
