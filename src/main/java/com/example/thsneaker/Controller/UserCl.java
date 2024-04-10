package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.User;
import com.example.thsneaker.Repository.UserRp;
import com.example.thsneaker.Service.UserSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("user")
public class UserCl {
    @Autowired
    UserRp userRp;
    @Autowired
    UserSV userSV;
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User loginUser = userRp.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (loginUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
        return ResponseEntity.ok(loginUser);
    }
    @PostMapping("/save")
    public String save(@RequestBody User u) {
        boolean check = userSV.insert(u);
        return check ? "Đăng ký thành công" : "Email tồn tại";
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        Optional<User> optionalUser = userRp.findById(id);
        if (!optionalUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        User user = optionalUser.get();
//        UserResponse userResponse = new UserResponse(user.getId(), user.getName(), user.getEmail());
        return ResponseEntity.ok(user);
    }
}
