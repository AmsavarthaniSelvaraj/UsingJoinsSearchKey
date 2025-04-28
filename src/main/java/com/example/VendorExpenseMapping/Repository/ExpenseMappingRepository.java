package com.example.VendorExpenseMapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.VendorExpenseMapping.Entity.ExpenseMapping;

@Repository
public interface ExpenseMappingRepository extends JpaRepository<ExpenseMapping, Integer> {
	

		
		    @Query("SELECT em FROM ExpenseMapping em JOIN em.vendor v JOIN em.expense e WHERE em.id = :id")
		    List<ExpenseMapping> findAllExpenseMapping(@Param("id") int id);

		    @Query("SELECT em FROM ExpenseMapping em " +
		    	       "JOIN em.vendor v " +
		    	       "JOIN em.expense e " +
		    	       "WHERE LOWER(v.name) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
		    	       "   OR LOWER(v.address) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
		    	       "   OR LOWER(v.contactNo) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
		    	       "   OR LOWER(e.name) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
		    	       "   OR STR(e.amount) LIKE CONCAT('%', :keyword, '%') " +
		    	       "   OR STR(em.id) LIKE CONCAT('%', :keyword, '%')")
		    	List<ExpenseMapping> searchAllFields(@Param("keyword") String keyword);

		    
}
