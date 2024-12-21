package net.javaguides.InventoryManagementSystem.util;

import net.javaguides.InventoryManagementSystem.model.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {

    // Generate a CSV report for the given list of products
    public static void generateProductReport(List<Product> products, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write header
            writer.append("ID, Name, Price\n");

            // Write product data
            for (Product product : products) {
                writer.append(product.getId().toString())
                        .append(",")
                        .append(product.getName())
                        .append(",")
                        .append(String.valueOf(product.getPrice()))
                        .append("\n");
            }
        }
    }

    // Generate a CSV report for the given list of inventories
    public static void generateInventoryReport(List<Inventory> inventories, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write header
            writer.append("Inventory ID, Store ID, Product ID, Quantity\n");

            // Write inventory data
            for (Inventory inventory : inventories) {
                writer.append(inventory.getId().toString())
                        .append(",")
                        .append(inventory.getStoreId().toString())
                        .append(",")
                        .append(inventory.getProductId().toString())
                        .append(",")
                        .append(String.valueOf(inventory.getQuantity()))
                        .append("\n");
            }
        }
    }
}
//the