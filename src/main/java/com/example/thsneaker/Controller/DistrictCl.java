package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.Country;
import com.example.thsneaker.Model.District;
import com.example.thsneaker.Repository.DiscountRp;
import com.example.thsneaker.Repository.DistrictRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("district")
public class DistrictCl {
    @Autowired
    DistrictRp districtRp;
    @PostMapping("/save")
    public void save(@RequestBody District d) {
        districtRp.save(d);
    }

    @GetMapping("")
    public List<District> getAll() {
        return districtRp.findAll();
    }
}
