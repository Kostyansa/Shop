package org.example.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {

    private Long id;

    private Customer customer;

    private List<Bundle> bundles;

    private List<Item> items;

    private Payment payment;
}
