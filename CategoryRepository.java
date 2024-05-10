package com.nimapinfotech.category_product.repositoryInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nimapinfotech.category_product.Category.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

