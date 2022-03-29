package in.tam.expensetracker.controller;


import in.tam.expensetracker.domain.Expense;
import in.tam.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RequestMapping("/api/v1")
@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>>get(){
        List<Expense> expenses= expenseService.findAll();
        return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);

    }
}
