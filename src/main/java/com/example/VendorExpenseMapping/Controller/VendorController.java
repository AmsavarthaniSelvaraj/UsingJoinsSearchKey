package com.example.VendorExpenseMapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VendorExpenseMapping.Entity.Vendor;
import com.example.VendorExpenseMapping.Service.VendorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/vendor")

public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@PostMapping("/create")
	public Vendor saveVendor(@RequestBody Vendor vendor){
		return vendorService.createVendor(vendor);
	}
	
}
