package com.example.VendorExpenseMapping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VendorExpenseMapping.Entity.Expense;
import com.example.VendorExpenseMapping.Entity.ExpenseMapping;
import com.example.VendorExpenseMapping.Entity.Vendor;
import com.example.VendorExpenseMapping.Repository.ExpenseMappingRepository;
import com.example.VendorExpenseMapping.Repository.ExpenseRepository;
import com.example.VendorExpenseMapping.Repository.VendorRepository;

@Service
public class ExpenseMappingService {

	@Autowired
	private ExpenseMappingRepository expenseMappingRepository;
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public ExpenseMapping createMapping(ExpenseMapping expenseMapping) {
		return expenseMappingRepository.save(expenseMapping);
	}

	public List<ExpenseMapping> getDetails(int id) {
		return expenseMappingRepository.findAllExpenseMapping(id);
	}

	public List<ExpenseMapping> getAllField(String keyword) {
		return expenseMappingRepository.searchAllFields(keyword);
	}
	
	public ExpenseMapping update(int id, ExpenseMapping newData) {
		ExpenseMapping e =  expenseMappingRepository.findById(id).orElseThrow(() -> new RuntimeException("Expense Mapping Id Not found"));
		
		if(e != null) {
			int vendorId=(newData.getVendor().getId());
			int expenseId=(newData.getExpense().getId());
			
			Vendor vendor=vendorRepository.findById(vendorId).orElseThrow(()-> new RuntimeException(" VendorId not found"));
			Expense expense=expenseRepository.findById(expenseId).orElseThrow(()-> new RuntimeException("ExpenseId not found"));
			e.setVendor(vendor);
			e.setExpense(expense);
			
			return expenseMappingRepository.save(e);
		}
      throw new RuntimeException("Not Found");
}
	
	public void deleteMapping(int id) {
		expenseMappingRepository.deleteById(id);
	}
}
