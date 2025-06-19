package com.storefront.Model;


import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;


    @JoinColumn(name = "category_id",nullable = false)
    @ManyToOne
    private Category category;


}
