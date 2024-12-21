package net.javaguides.InventoryManagementSystem.controller;

import net.javaguides.InventoryManagementSystem.model.Product;
import net.javaguides.InventoryManagementSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product savedProduct = productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productId, product);
        return ResponseEntity.ok(updatedProduct);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer productId) {
        Product product = productService.getProductById(productId);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}

//the