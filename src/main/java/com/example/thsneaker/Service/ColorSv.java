package com.example.thsneaker.Service;

import com.example.thsneaker.Model.ProductColor;
import com.example.thsneaker.Model.ProductDetail;
import com.example.thsneaker.Repository.ProductColorRp;
import com.example.thsneaker.Repository.ProductDetailRp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class ColorSv {
    @Autowired
    ProductColorRp productColorRp;
    @Autowired
    ProductDetailRp productDetailRp;
    public String uploadImage(String path, MultipartFile file, Long id) {
        String name = file.getOriginalFilename();
        // Tạo thư mục nếu chưa tồn tại
        File f = new File(path);
        if (!f.exists()) {
            f.mkdir();
        }
        // Tạo đường dẫn đầy đủ tới file
        String filepath = path + File.separator + name;
        File fileToCopy = new File(filepath);
        try {
            // Kiểm tra nếu file đã tồn tại thì xóa file cũ
            if (fileToCopy.exists()) {
                fileToCopy.delete();
            }
            // Sao chép file mới
            Files.copy(file.getInputStream(), Paths.get(filepath));
            System.out.println(filepath);

            // Lưu thông tin của file và id vào cơ sở dữ liệu
            ProductColor p = new ProductColor(id, name);
            // Gọi hàm lưu vào cơ sở dữ liệu, ví dụ:
            productColorRp.save(p); // Chỉ là ví dụ, cần thay đổi phù hợp với cơ sở dữ liệu của bạn

        } catch (Exception e) {
            throw new RuntimeException("Không thể lưu file. Lỗi: " + e.getMessage());
        }
        return name;
    }
    public String uploadDetails(String path, MultipartFile file, String image) {
        String name = file.getOriginalFilename();
        // Tạo thư mục nếu chưa tồn tại
        File f = new File(path);
        if (!f.exists()) {
            f.mkdir();
        }
        // Tạo đường dẫn đầy đủ tới file
        String filepath = path + File.separator + name;
        File fileToCopy = new File(filepath);
        try {
            // Kiểm tra nếu file đã tồn tại thì xóa file cũ
            if (fileToCopy.exists()) {
                fileToCopy.delete();
            }
            // Sao chép file mới
            Files.copy(file.getInputStream(), Paths.get(filepath));
            System.out.println(filepath);

            // Lưu thông tin của file và id vào cơ sở dữ liệu
            ProductDetail p = new ProductDetail(image, name);
            // Gọi hàm lưu vào cơ sở dữ liệu, ví dụ:
            productDetailRp.save(p); // Chỉ là ví dụ, cần thay đổi phù hợp với cơ sở dữ liệu của bạn

        } catch (Exception e) {
            throw new RuntimeException("Không thể lưu file. Lỗi: " + e.getMessage());
        }
        return name;
    }
    public InputStream getImage(String path, String filename) throws IOException {
        String fullpath = path+File.separator+filename;
        InputStream inputStream = new FileInputStream(fullpath);
        return inputStream;
    }
}
