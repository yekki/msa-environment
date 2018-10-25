package me.yekki.springcloud.env.test.vo;

import lombok.Data;

@Data
public class UserVO {

    Long id;
    String username;
    String password;
    String email;
}