package com.nimapinfotech.category_product.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimapinfotech.category_product.Product.Product;
import com.nimapinfotech.category_product.repositoryInterface.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create operation
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Read operation
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Update operation
    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null; // or throw NotFoundException
    }

    // Delete operation
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

