package com.company;

public class Cashier extends Employee{

    Cashier(String e_name,String type){
        super(e_name, type);
    }

    @Override
    public void changeInterest(Account account, double rate) {
        System.out.println("You don't have permission to this operation");
    }
}
