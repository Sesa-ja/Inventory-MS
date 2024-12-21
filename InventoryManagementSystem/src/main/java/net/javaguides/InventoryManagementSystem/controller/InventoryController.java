package net.javaguides.InventoryManagementSystem.controller;

import net.javaguides.InventoryManagementSystem.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/inventories/{storeId}")
    public ResponseEntity<Inventory> saveInventory(@PathVariable Integer storeId, @RequestBody Inventory inventory) {
        Inventory savedInventory = inventoryService.saveInventory(storeId, inventory);
        return ResponseEntity.ok(savedInventory);
    }

    @PutMapping("/inventories/{inventoryId}/{storeId}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable Integer inventoryId, @PathVariable Integer storeId, @RequestBody Inventory inventory) {
        Inventory updatedInventory = inventoryService.updateInventory(inventoryId, storeId, inventory);
        return ResponseEntity.ok(updatedInventory);
    }

    @GetMapping("/inventories")
    public ResponseEntity<List<Inventory>> getAllInventories() {
        List<Inventory> inventories = inventoryService.getAllInventories();
        return ResponseEntity.ok(inventories);
    }

    @DeleteMapping("/inventories/{inventoryId}")
    public ResponseEntity<Map<String, Boolean>> deleteInventory(@PathVariable Integer inventoryId) {
        inventoryService.deleteInventory(inventoryId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

//the