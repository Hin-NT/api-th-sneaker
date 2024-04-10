package com.example.thsneaker.Controller;

import com.example.thsneaker.Model.ProductDetail;
import com.example.thsneaker.Repository.ProductDetailRp;
import com.example.thsneaker.Service.ColorSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("details")
public class ProductDetailCl {
    @Value("${project.image}/details")
    String path;
    @Autowired
    ColorSv colorSv;
    @Autowired
    ProductDetailRp productDetailRp;
    @PostMapping("/save")
    public ResponseEntity<String> addDetailImage(
            @RequestParam("image_color") String imageColor,
            @RequestParam("files") MultipartFile[] files
    ) {
        try {
            Arrays.stream(files).forEach(file -> {
                colorSv.uploadDetails(path, file, imageColor);
            });

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while adding product images");
        }
    }
    @RequestMapping(value = "/{image_name}", method = RequestMethod.GET)
    public void getImage(@PathVariable("image_name")String image_name , HttpServletResponse response) throws IOException {
        InputStream inputStream = colorSv.getImage(path,image_name);
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(inputStream,response.getOutputStream());
    }
    @GetMapping("")
    public List<ProductDetail> getAll() {
        return productDetailRp.findAll();
    }
}
