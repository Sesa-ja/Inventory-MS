package net.javaguides.InventoryManagementSystem.model;

import javax.persistence.*;

@Entity
public class InventoryService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer storeId;
    private Integer productId;
    private int quantity;

    // Getter and Setter for 'id'
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for 'storeId'
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    // Getter and Setter for 'productId'
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    // Getter and Setter for 'quantity'
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
//the