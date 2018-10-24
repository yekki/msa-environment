package me.yekki.springcloud.env.test.repository;

import me.yekki.springcloud.env.test.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
