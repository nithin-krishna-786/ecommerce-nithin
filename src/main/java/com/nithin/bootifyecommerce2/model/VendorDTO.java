package com.nithin.bootifyecommerce2.model;

import java.util.List;

import com.nithin.bootifyecommerce2.domain.Product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class VendorDTO {

    private Long id;

    @NotNull
    @Size(max = 50)
    private String name;
    
    private List<ProductDTO> products;

}
