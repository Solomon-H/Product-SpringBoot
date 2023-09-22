package com.solobeki.productSpring.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.solobeki.productSpring.model.Product;
import com.solobeki.productSpring.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductService service;

    
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductId(@PathVariable Long id){
        return service.getProductById(id);
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        service.addProduct(product);
        return "Successfully created the product";
    }

    @PutMapping("/product")
    public String updateProduct(@RequestBody Product product){
        service.updateProduct(product);
        return "Successfully updated the product";
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return "Successfully deleted the product";
    }
}
