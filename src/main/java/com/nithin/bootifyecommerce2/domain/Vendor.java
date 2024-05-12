package com.nithin.bootifyecommerce2.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "vendorOfProduct",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Product> product = new ArrayList<Product>();

}
