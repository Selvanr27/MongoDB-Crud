package in.tam.expensetracker.service;

import in.tam.expensetracker.domain.Expense;
import in.tam.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
       return expenseRepository.findAll();

    }
}
