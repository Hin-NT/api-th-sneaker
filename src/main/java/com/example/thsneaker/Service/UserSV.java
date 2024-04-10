package com.example.thsneaker.Service;

import com.example.thsneaker.Model.User;
import com.example.thsneaker.Repository.UserRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSV {
    @Autowired
    UserRp userRp;
    public boolean insert(User u) {
        if (userRp.existsByEmail(u.getEmail())) return false;
        userRp.save(u);
        return true;
    }
}
