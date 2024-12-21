package net.javaguides.InventoryManagementSystem.controller;

import net.javaguides.InventoryManagementSystem.model.Category;
import net.javaguides.InventoryManagementSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Method to add a new category
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Other methods...

    public List<Category> listAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category editCategory(Integer categoryId, Category category) {
        // Your logic to update the category (you might need to check if the category exists)
        category.setId(categoryId);
        return categoryRepository.save(category);
    }
}
//the