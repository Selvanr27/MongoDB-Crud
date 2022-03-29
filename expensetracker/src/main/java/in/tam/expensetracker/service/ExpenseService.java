package in.tam.expensetracker.service;

import in.tam.expensetracker.domain.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();
}
