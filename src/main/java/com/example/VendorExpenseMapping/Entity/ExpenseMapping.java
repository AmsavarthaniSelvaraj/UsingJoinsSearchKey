package com.example.VendorExpenseMapping.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="expenseMapping")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "vendor_id")
	private Vendor vendor;
	
	@ManyToOne
    @JoinColumn(name = "expense_id")
	private Expense expense;
	
}
