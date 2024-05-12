package com.nithin.bootifyecommerce2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.nithin.bootifyecommerce2.domain.Product;
import com.nithin.bootifyecommerce2.domain.Vendor;
import com.nithin.bootifyecommerce2.model.ProductDTO;
import com.nithin.bootifyecommerce2.repos.ProductRepository;
import com.nithin.bootifyecommerce2.repos.VendorRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private VendorRepository vendorRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDTO createProduct(ProductDTO productDTO) {
		Product product = modelMapper.map(productDTO, Product.class);
		Long vendorId = productDTO.getVendorOfProduct().getId();

		Vendor vendor = vendorRepository.findById(vendorId).orElseThrow(() -> new RuntimeException("Vendor Not found"));
		product.setVendorOfProduct(vendor);
		
		Product savedProduct = productRepository.save(product);
		productDTO = modelMapper.map(savedProduct, ProductDTO.class);
		return productDTO;
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(product -> modelMapper.map(product, ProductDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public ProductDTO getProductById(Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		return modelMapper.map(product, ProductDTO.class);
	}

	@Override
	public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
		Product existingProduct = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

		modelMapper.map(productDTO, existingProduct);

		Product updatedProduct = productRepository.save(existingProduct);
		return modelMapper.map(updatedProduct, ProductDTO.class);
	}

	@Override
	public void deleteProduct(Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		productRepository.delete(product);
	}
}
