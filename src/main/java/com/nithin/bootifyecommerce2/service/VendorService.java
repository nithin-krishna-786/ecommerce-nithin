package com.nithin.bootifyecommerce2.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithin.bootifyecommerce2.domain.Vendor;
import com.nithin.bootifyecommerce2.model.VendorDTO;
import com.nithin.bootifyecommerce2.repos.VendorRepository;


@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Create a new Vendor
    public VendorDTO createVendor(VendorDTO vendorDTO) {
        Vendor vendor = modelMapper.map(vendorDTO, Vendor.class);
        Vendor savedVendor = vendorRepository.save(vendor);
        return modelMapper.map(savedVendor, VendorDTO.class);
    }
}