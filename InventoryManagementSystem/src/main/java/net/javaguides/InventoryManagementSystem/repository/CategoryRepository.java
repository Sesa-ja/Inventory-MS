package net.javaguides.InventoryManagementSystem.repository;

import net.javaguides.InventoryManagementSystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
//the