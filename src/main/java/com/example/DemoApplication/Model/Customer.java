package com.example.DemoApplication.Model;


import jakarta.persistence.*;

@Entity
@Table(name ="customerData")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String username;
    private String password;
    private String login;
    private String phone;
}
