package me.yekki.springcloud.env.test.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import me.yekki.springcloud.env.test.vo.UserVO;

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
        vo.setId(this.getId());
        vo.setUsername(this.getUsername());
        vo.setPassword(this.getPassword());
        vo.setEmail(this.getEmail());

        return vo;
    }
}
