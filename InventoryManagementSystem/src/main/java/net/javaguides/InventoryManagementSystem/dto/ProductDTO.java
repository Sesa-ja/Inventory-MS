package net.javaguides.InventoryManagementSystem.dto;

public class ProductDTO {

    private Integer id;
    private String name;
    private double price;

    public ProductDTO() {}

    public ProductDTO(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
//the