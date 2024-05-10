package com.nimapinfotech.category_product.repositoryInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nimapinfotech.category_product.Product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

