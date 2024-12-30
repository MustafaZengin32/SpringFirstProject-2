package com.mustafazengin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    //Simdi relation kurmam lazim

    @OneToOne //Ilk One Customer , Ikincisi ise Adress //Bu iliskinin sahibi
    private Adress address;






}
