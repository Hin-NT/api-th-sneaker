package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.City;
import com.example.thsneaker.Model.PrImCl;
import com.example.thsneaker.Model.Product;
import com.example.thsneaker.Model.ProductColor;
import com.example.thsneaker.Repository.ProductRp;
import com.example.thsneaker.Service.ProductSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductCl {
    @Autowired
    ProductRp productRp;
    @Autowired
    ProductSv productSv;
    @PostMapping("/save")
    public void save(@RequestBody Product p) {
        productRp.save(p);
    }
    @GetMapping("")
    public List<PrImCl> getAll() {
        List<PrImCl> list = productSv.getAll();
        return list;
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrImCl> getProductById(@PathVariable Long id) {
        System.out.println(productSv.getAllById(id));
        return ResponseEntity.ok(productSv.getAllById(id));
    }
}
