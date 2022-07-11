package com.OvenexWeb.WebApplication.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "userId")
    @Column(name = "userId")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name = "";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ovenId", referencedColumnName = "ovenId")
    private OvenProduct oven;

    @Column(name = "username")
    private String username = name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    // private String userToken;

    public User() {}

    public User(String email, String password, String name, String surname, String phone, String address, String country, String city) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.city = city;
    }
}
