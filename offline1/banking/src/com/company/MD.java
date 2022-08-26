package com.company;

public class MD extends Employee{

    MD(String e_name,String type){
        super(e_name, type);
    }

    @Override
    public void changeInterest(Account account, double rate) {
        account.setRate(rate);
    }
}
