package com.glocery.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String email_id;
    //   @Column(length = 10,unique = true,nullable = false)
    private String password;
    private String mobileNo;

    @Embedded
    private Address address;
}
