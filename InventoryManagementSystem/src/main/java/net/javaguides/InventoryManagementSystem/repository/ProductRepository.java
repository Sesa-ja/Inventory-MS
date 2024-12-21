package net.javaguides.InventoryManagementSystem.repository;

import net.javaguides.InventoryManagementSystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

//the