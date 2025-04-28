package com.example.VendorExpenseMapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VendorExpenseMapping.DTO.ExpenseDTO;
import com.example.VendorExpenseMapping.Entity.Expense;
import com.example.VendorExpenseMapping.Service.ExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@PostMapping("/create")
	public Expense saveExpense(@RequestBody ExpenseDTO expenseDTO) {
		return expenseService.createExpense(expenseDTO);
	}

}
