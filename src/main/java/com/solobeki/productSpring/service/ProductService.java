package com.solobeki.productSpring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.solobeki.productSpring.model.Product;
import com.solobeki.productSpring.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
   }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id); 
    }


    public void updateProduct(Product product) {
        productRepository.save(product);
    }

     public void deleteProduct(Long id) {
        productRepository.deleteById(id);;
    }
}
