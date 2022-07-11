package com.OvenexWeb.WebApplication.Entities;

import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table
public class OvenProduct {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "ovenId")
    @Column(name = "ovenId")
    private Long ovenId;

    @OneToOne(mappedBy = "oven")
    private User user;

    @Column(name="Model")
    private String model;

    @Column(name="Price")
    private Integer price;

    @Column(name="Image")
    private String OvenImage;

    @Column(name="MinTemperature")
    public Integer minTemperature;

    @Column(name="MaxTemperature")
    public Integer maxTemperature;

    @Column(name="Color")
    private String color;

    @Column(name="Height")
    private Double height;

    @Column(name="Width")
    private Double width;

    public OvenProduct() {
    }

    public OvenProduct(Long ovenId, String model, Integer minTemperature, Integer maxTemperature, String color, Double height, Double width) {
        this.ovenId = ovenId;
        this.model = model;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.color = color;
        this.height = height;
        this.width = width;
    }
}
