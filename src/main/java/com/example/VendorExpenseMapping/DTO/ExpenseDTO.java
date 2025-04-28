package com.example.VendorExpenseMapping.DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDTO {
	private int id;
	private String name;
	private Double amount;
	private LocalDate expenseDate;

	
	
}
