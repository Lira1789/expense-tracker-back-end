package com.lira17.expensetracker.dto.get;

import com.lira17.expensetracker.exchange.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseBalanceEntityGetDto {

    private long id;

    private String title;

    private String description;

    private LocalDate date;

    private double amount;

    private Currency currency;

    private Currency mainCurrency;

    private double amountInMainCurrency;

    private double rate;

}