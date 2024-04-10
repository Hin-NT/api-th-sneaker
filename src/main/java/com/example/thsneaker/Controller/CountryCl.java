package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.Country;
import com.example.thsneaker.Model.User;
import com.example.thsneaker.Repository.CountryRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("country")
public class CountryCl {
    @Autowired
    CountryRp countryRp;
    @PostMapping("/save")
    public void save(@RequestBody Country c) {
        countryRp.save(c);
    }
    @GetMapping("")
    public List<Country> getAll() {
        return countryRp.findAll();
    }
}
