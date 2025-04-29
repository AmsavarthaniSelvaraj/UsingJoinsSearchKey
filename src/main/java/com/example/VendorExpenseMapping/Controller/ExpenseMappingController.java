package com.example.VendorExpenseMapping.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.VendorExpenseMapping.Entity.ExpenseMapping;
import com.example.VendorExpenseMapping.Service.ExpenseMappingService;

@RestController
@RequestMapping("/api/expenseMapping")
public class ExpenseMappingController {

	@Autowired
	private ExpenseMappingService expenseMappingService;
	
	@PostMapping("/create")
	public ExpenseMapping createExpenseMapping(@RequestBody ExpenseMapping expenseMapping) {
		return expenseMappingService.createMapping(expenseMapping);
	}
	
	@GetMapping("/get/{id}")
	public List<ExpenseMapping> getDetails(@PathVariable int id) {
		return expenseMappingService.getDetails(id);
	}
	
	@GetMapping("/search")
	public List<ExpenseMapping> search(@RequestParam String keyword){
		return expenseMappingService.getAllField(keyword);
	}
	
	@PutMapping("/update/{id}")
	public ExpenseMapping update(@PathVariable int id,@RequestBody ExpenseMapping newData) {
		return expenseMappingService.update(id , newData);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		expenseMappingService.deleteMapping(id);
		return " Deleted Successfully ";
	}
}
