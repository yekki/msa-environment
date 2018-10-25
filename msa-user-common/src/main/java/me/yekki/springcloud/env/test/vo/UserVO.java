package me.yekki.springcloud.env.test.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserVO {
    Long id;
    String username;
    String password;
    String email;
}