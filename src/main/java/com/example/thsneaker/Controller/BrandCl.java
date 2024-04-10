package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.Brand;
import com.example.thsneaker.Model.City;
import com.example.thsneaker.Repository.BrandRp;
import com.example.thsneaker.Repository.CityRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandCl {
    @Autowired
    BrandRp brandRp;
    @PostMapping("/save")
    public void save(@RequestBody Brand b) {
        brandRp.save(b);
    }

    @GetMapping("")
    public List<Brand> getAll() {
        return brandRp.findAll();
    }
}
