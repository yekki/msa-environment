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
public class User extends UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;


    public User() {
        super();
    }

    public User(String username, String password, String email) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
    }
}
