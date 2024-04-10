package com.example.thsneaker.Controller;


import com.example.thsneaker.Model.ProductSize;
import com.example.thsneaker.Repository.ProductSizeRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("size")
public class ProductSizeCl {
    @Autowired
    ProductSizeRp productSizeRp;

    @PostMapping("/save")
    public void addProductSizeModel(@RequestBody ProductSize ps) {
        productSizeRp.save(ps);
    }
    @GetMapping("")
    public List<ProductSize> getAll() {
        return productSizeRp.findAll();
    }
    @GetMapping("/{image_color}")
    public List<ProductSize> getProductSizeById(@PathVariable String image_color) {
        return productSizeRp.findSizeByImage(image_color);
    }
}
