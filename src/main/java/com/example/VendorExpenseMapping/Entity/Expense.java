package com.example.VendorExpenseMapping.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="expense")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="expenseName")
	private String name;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="expenseDate")
	private LocalDate expenseDate;

}
