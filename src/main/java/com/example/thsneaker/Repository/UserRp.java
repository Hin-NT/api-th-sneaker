package com.example.thsneaker.Repository;

import com.example.thsneaker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRp extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);

    boolean existsByEmail(String email);
}
