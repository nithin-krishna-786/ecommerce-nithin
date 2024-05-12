package com.nithin.bootifyecommerce2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithin.bootifyecommerce2.domain.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
