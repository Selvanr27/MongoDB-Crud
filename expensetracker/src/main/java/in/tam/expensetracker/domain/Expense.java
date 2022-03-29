package in.tam.expensetracker.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Getter
@Setter
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private  String expense;

    private String description;

    private BigDecimal amount;
}
