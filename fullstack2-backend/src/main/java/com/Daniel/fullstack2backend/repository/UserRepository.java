package com.Daniel.fullstack2backend.repository;

import com.Daniel.fullstack2backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
