package net.javaguides.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}

//the