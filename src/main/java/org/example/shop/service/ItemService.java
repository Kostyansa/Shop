package org.example.shop.service;

import org.example.shop.entity.Item;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ItemService {

    CompletableFuture<Item> find(Long id);

    @Async
    CompletableFuture<List<Item>> findByBundleId(Long id);
}
