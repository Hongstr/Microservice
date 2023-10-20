package com.coro.inventoryservice.controller;

import com.coro.inventoryservice.dto.InventoryResponse;
import com.coro.inventoryservice.model.Inventory;
import com.coro.inventoryservice.repository.InventoryRepository;
import com.coro.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }


}
