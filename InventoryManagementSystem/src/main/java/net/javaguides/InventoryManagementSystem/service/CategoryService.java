package net.javaguides.InventoryManagementSystem.service;

import net.javaguides.InventoryManagementSystem.model.Category;
import net.javaguides.InventoryManagementSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }

    public void printCategoryName(Category category) {
        System.out.println("Category Name: " + category.getName());
    }
}

//the