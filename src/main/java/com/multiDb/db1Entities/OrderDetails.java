package com.multiDb.db1Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    private Long id;
    private String productName;

}
