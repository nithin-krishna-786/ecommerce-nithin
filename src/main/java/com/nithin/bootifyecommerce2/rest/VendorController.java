package com.nithin.bootifyecommerce2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithin.bootifyecommerce2.model.VendorDTO;
import com.nithin.bootifyecommerce2.service.VendorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping
    public ResponseEntity<VendorDTO> createVendor(@RequestBody VendorDTO vendorDTO) {
        VendorDTO createdVendor = vendorService.createVendor(vendorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVendor);
    }
}
