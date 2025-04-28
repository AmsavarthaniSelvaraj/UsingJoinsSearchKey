package com.example.VendorExpenseMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.VendorExpenseMapping.Entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

	
}
