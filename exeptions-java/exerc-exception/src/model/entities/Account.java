package model.entities;

import model.entities.exception.AccountException;

public class Account {

    private Integer number;
    private String name;
    private Double balance;
    private static final Double WITHDRAWLIMIT = 300.00;

    public Account() {

    }

    public Account(Integer number, String name, Double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        validationWithdraw(amount);
        balance -= amount;
    }

    private void validationWithdraw(Double amount){
        if (amount > WITHDRAWLIMIT){
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit.");
        }
        if (amount > getBalance()){
            throw new AccountException("Withdraw error: Not enough balance.");
        }
    }
}
