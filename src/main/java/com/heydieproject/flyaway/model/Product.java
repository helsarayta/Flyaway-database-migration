package com.heydieproject.flyaway.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;
    private String subCategory;
}
