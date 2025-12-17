package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Private Long id;

    @NotBlank(message="Name is not Valid");
    Private String name;

    @Email(message = "Email Format is not Valid")
    private String email;

    public studentEntity(){

    }
    public studentEntity(Long id,String email){
        this.
    }


}