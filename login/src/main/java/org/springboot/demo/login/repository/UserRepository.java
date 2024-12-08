package org.springboot.demo.login.repository;

import org.springboot.demo.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
