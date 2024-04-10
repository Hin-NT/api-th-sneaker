package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.City;
import com.example.thsneaker.Model.Country;
import com.example.thsneaker.Repository.CityRp;
import com.example.thsneaker.Repository.CountryRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("city")
public class CityCl {
    @Autowired
    CityRp cityRp;
    @PostMapping("/save")
    public void save(@RequestBody City c) {
        cityRp.save(c);
    }

    @GetMapping("")
    public List<City> getAll() {
        return cityRp.findAll();
    }
}
