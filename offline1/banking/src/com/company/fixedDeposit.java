package com.company;

public class fixedDeposit extends Account {

    fixedDeposit(String name, double total) {
        super(name);
        this.total = total;
        this.type = "FIXEDDEPOSIT";
        rate = 0.15;
        loanRate = .1;
        highest_withdrawal =10000000;
        least_total=0;
        highest_loan=100000;
        year=0;
        System.out.println("FIXED DEPOSIT account for "+name+" created; initial balance "+total+"$");
    }

    @Override
    public void deposit(double d_total) {
        if(d_total<50000){
            System.out.println("Minimum deposit account for Fixed Account is 50000$");
            return;
        }
        this.total += d_total;
        System.out.println(d_total+"$ deposited, current balance "+total+"$");
    }

    @Override
    public void withdraw(double w_total) {
        if(year<1){
            System.out.println("Can't withdraw before maturity year ");
            return;
        }
        if(w_total>highest_withdrawal){

        }
        else if((total - w_total) > least_total){
            total-=w_total;
            System.out.println(w_total+"$ withdrawed; Current balance : "+total+"$");
            return;
        }
        System.out.println("Invalid Transaction; Current balance : "+total+"$");

    }

    @Override
    public void reqLoan(double loan){
        if(loanAmount+loan>highest_loan){
            System.out.println("Loan request unsuccessful.");
        }
        else{
            pendingAmount=loan;
            System.out.println("Loan request successful, send for approval");
        }
    }

    @Override
    public void checkBalance() {
        System.out.print("Current balance "+total+"$");
        if(loanAmount>0)System.out.print(", Loan amount "+loanAmount+"$");
        System.out.println();
    }
}
