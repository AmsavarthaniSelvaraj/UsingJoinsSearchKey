package com.example.VendorExpenseMapping.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VendorExpenseMapping.DTO.ExpenseDTO;
import com.example.VendorExpenseMapping.Entity.Expense;
import com.example.VendorExpenseMapping.Repository.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@SuppressWarnings("unused")
	public Expense createExpense(ExpenseDTO expenseDTO) {
		Expense expense = new Expense();
		expense.setName(expenseDTO.getName());
		expense.setAmount(expenseDTO.getAmount());
		expense.setExpenseDate(LocalDate.now());
		return expenseRepository.save(expense);
	}
}
