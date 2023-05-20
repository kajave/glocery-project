package com.glocery.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oder_id;

//    @Transient
//    private int billing_id;
    private double amount;
    @Temporal(value = TemporalType.DATE)
    private Date orderAt;



}
