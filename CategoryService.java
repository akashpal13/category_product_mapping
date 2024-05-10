package com.nimapinfotech.category_product.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nimapinfotech.category_product.Category.Category;
import com.nimapinfotech.category_product.repositoryInterface.CategoryRepository;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Create operation
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Read operation
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Update operation
    public Category updateCategory(Long id, Category category) {
        if (categoryRepository.existsById(id)) {
            category.setId(id);
            return categoryRepository.save(category);
        }
        return null; // or throw NotFoundException
    }

    // Delete operation
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}


