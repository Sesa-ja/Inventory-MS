package net.javaguides.InventoryManagementSystem.dto;

public class InventoryDTO {

    private Integer id;
    private Integer storeId;
    private Integer productId;
    private int quantity;

    public InventoryDTO() {}

    public InventoryDTO(Integer id, Integer storeId, Integer productId, int quantity) {
        this.id = id;
        this.storeId = storeId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
//the