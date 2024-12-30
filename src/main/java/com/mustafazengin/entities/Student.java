package com.mustafazengin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity//bunu bir tablo olarak islesin diye //Bunu tanimasi icin app class da Entityscan dememiz lazim
@Table(name="student")//table name i vermek icin
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id//Primary key olarak islesin diye
    @Column(name="id") //sutun name ini vermek icin , yazmasak bile default olarak variable name i veriridi
    @GeneratedValue(strategy = GenerationType.IDENTITY)//sirali olarak id yi arttirir
    private Integer id;

    @Column(name="first_name",nullable = false,length = 40) //bos gecilemesin demek
    private String firstName;

    @Column(name="last_name",nullable = false)
    private String lastName;

    @Column(name="birth_of_date",nullable = true)
    private String birthOfDate;





}
