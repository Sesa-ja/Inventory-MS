package net.javaguides.InventoryManagementSystem.service;

import net.javaguides.InventoryManagementSystem.model.Product;
import net.javaguides.InventoryManagementSystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Integer productId, Product product) {
        return productRepository.findById(productId).map(existingProduct -> {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }
}

//the