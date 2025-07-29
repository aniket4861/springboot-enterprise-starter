package com.aniket.springboot_enterprise_starter.repository;

import com.aniket.springboot_enterprise_starter.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
