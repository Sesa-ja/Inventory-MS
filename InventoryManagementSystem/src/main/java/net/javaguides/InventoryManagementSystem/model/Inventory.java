package net.javaguides.InventoryManagementSystem.model;

import jakarta.persistence.*;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer storeId;
    private Integer productId;
    private int quantity;

    // Getters and Setters
}
//the