package com.bala.micoservice_product.controller;

import com.bala.micoservice_product.model.Product;
import com.bala.micoservice_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {



        @Autowired
        private ProductRepository productRepository;

        @GetMapping
        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

        @PostMapping
        public Product createProduct(@RequestBody Product product) {
            return productRepository.save(product);
        }

        @GetMapping("/{id}")
        public Product getProductById(@PathVariable Long id) {
            return productRepository.findById(id).orElse(null);
        }

}
