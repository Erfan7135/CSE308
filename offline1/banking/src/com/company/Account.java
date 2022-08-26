package com.company;

public abstract class Account {
    String name;
    String type;
    double total;
    double loanAmount;
    double pendingAmount;
    double rate;
    double loanRate;
    double highest_withdrawal;
    double least_total;
    double highest_loan;
    int year;

    Account(String name){
        this.name = name;
    }

    public abstract void deposit(double d_total);
    public abstract void withdraw(double w_total);
    public abstract void reqLoan(double loan);
    public abstract void checkBalance();

    public double getPending(){
        return pendingAmount;
    }

    public double getLoan(){
        return loanAmount;
    }

    public double getTotal(){
        return total;
    }

    public String getName(){
        return name;
    }

    public void update(){
        loanAmount=pendingAmount;
        pendingAmount=0;
        total+=loanAmount;
    }

    public void setRate(double rate){
        this.rate=rate;
    }

    public String getType(){
        return type;
    }

    public double getRate(){
        return rate;
    }

    public double getLoanRate(){
        return loanRate;
    }

    public void updateFund(double fund){
        if(type.equals("LOAN")){
            loanAmount+=fund;
            return;
        }
        total+=fund;
    }

    public void increment(){
        year++;
    }
}

