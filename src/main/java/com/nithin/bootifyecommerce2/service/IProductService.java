package com.nithin.bootifyecommerce2.service;

import java.util.List;

import com.nithin.bootifyecommerce2.model.ProductDTO;


public interface IProductService {

	ProductDTO createProduct(ProductDTO productDTO);
	List<ProductDTO> getAllProducts();
	ProductDTO getProductById(Long id);
	ProductDTO updateProduct(Long id, ProductDTO productDTO);
	void deleteProduct(Long id);

}
