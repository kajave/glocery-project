package com.glocery.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int units;
    private String picture;
    private String description;
    private double price;

    @JoinColumn(name = "category_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

}
