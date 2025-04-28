package com.example.VendorExpenseMapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VendorExpenseMapping.Entity.Vendor;
import com.example.VendorExpenseMapping.Repository.VendorRepository;

import lombok.RequiredArgsConstructor;

@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	public Vendor createVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	
}
