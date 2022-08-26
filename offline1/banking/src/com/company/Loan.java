package com.company;

public class Loan extends Account {

    Loan(String name, double total) {
        super(name);
        this.total = total;
        this.type = "LOAN";
        rate = 0.15;
        loanRate = .1;
        highest_withdrawal =10000000;
        least_total=0;
        highest_loan=100000;
        year=0;
        System.out.println("LOAN account for "+name+" created; initial balance "+total+"$");
    }

    @Override
    public void deposit(double d_total) {
        this.loanAmount += d_total;
        highest_loan=loanAmount*0.05;
        System.out.println(d_total+"$ loaned, current loan "+loanAmount+"$");
    }

    @Override
    public void withdraw(double w_total) {
        if(w_total > loanAmount){
            loanAmount-=w_total;
            System.out.println(w_total+"$ repayed; Current loan : "+loanAmount+"$");
            return;
        }
        System.out.println("Invalid Transaction; Current loan : "+loanAmount+"$");

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
        System.out.println("Current loan "+loanAmount+"$");
    }
}
