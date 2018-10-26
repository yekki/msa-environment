package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.UserVO;

import java.util.List;

public interface UserUIService {

    List<UserVO> getUsers();
}
