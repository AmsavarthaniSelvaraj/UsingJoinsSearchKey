package com.example.VendorExpenseMapping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VendorExpenseMapping.Entity.ExpenseMapping;
import com.example.VendorExpenseMapping.Repository.ExpenseMappingRepository;

@Service
public class ExpenseMappingService {

	@Autowired
	private ExpenseMappingRepository expenseMappingRepository;
	
	public ExpenseMapping createMapping(ExpenseMapping expenseMapping) {
		return expenseMappingRepository.save(expenseMapping);
	}

	public List<ExpenseMapping> getDetails(int id) {
		return expenseMappingRepository.findAllExpenseMapping(id);
	}

	public List<ExpenseMapping> getAllField(String keyword) {
		return expenseMappingRepository.searchAllFields(keyword);
	}
}
