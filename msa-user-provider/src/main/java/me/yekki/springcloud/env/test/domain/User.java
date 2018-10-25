package me.yekki.springcloud.env.test.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.Data;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    Long id;
    String username;
    String password;
    String email;


    public User() {
        super();
    }

    public User(String username, String password, String email) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
    }

    public User(UserVO user) {
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        this.setEmail(user.getEmail());
    }

    public UserVO toDTO() {
        UserVO vo = new UserVO();

        BeanUtils.copyProperties(this,vo);
        return vo;
    }
}
