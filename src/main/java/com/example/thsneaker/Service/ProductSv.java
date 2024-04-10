package com.example.thsneaker.Service;

import com.example.thsneaker.Model.PrImCl;
import com.example.thsneaker.Model.Product;
import com.example.thsneaker.Model.ProductColor;
import com.example.thsneaker.Repository.BrandRp;
import com.example.thsneaker.Repository.ProductColorRp;
import com.example.thsneaker.Repository.ProductRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductSv {
    @Autowired
    ProductRp pRp;
    @Autowired
    ProductColorRp pCRp;
    @Autowired
    BrandRp bRp;

    public List<PrImCl> getAll() {
        List<PrImCl> list = new ArrayList<>();
        List<Product> pList = pRp.findAll();
        for(Product p : pList) {
            String brand = bRp.findById(p.getBrand_id()).orElseThrow(() -> new NoSuchElementException("Brand not found")).getName();
            List<ProductColor> pCList = pCRp.findImagesByProductId(p.getId());
            list.add(new PrImCl(p.getId(), p.getName(), p.getDescription(), brand, p.getStatus(), p.getCreated_at(), p.getUpdated_at(), pCList));
        }
        return list;
    }

    public PrImCl getAllById(Long id) {
        Product p = pRp.findById(id).orElseThrow(() -> new NoSuchElementException("Product not found"));
        String brand = bRp.findById(p.getBrand_id()).orElseThrow(() -> new NoSuchElementException("Brand not found")).getName();
        List<ProductColor> pCList = pCRp.findImagesByProductId(p.getId());
        return new PrImCl(p.getId(), p.getName(), p.getDescription(), brand, p.getStatus(), p.getCreated_at(), p.getUpdated_at(), pCList);
    }

}
