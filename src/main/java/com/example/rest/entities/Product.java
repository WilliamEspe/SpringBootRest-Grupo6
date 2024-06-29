package com.example.rest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "precio")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fabricante", nullable = false)
    @JsonBackReference
    private Maker maker;
}
