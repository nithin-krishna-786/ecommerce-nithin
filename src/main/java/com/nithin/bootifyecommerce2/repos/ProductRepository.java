package com.nithin.bootifyecommerce2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithin.bootifyecommerce2.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
