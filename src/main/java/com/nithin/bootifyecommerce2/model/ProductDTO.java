package com.nithin.bootifyecommerce2.model;

import java.util.Set;

import lombok.Data;

@Data
public class ProductDTO {

	private Long id;
	private String name;
	private Integer price;
	
	private Set<CommentDTO> comments;
	private VendorDTO vendorOfProduct;
	

}
