package com.company;

public class Employee {
    String name;
    String type;

    Employee(String e_name, String type){
        name=e_name;
        this.type=type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void LookUP(Account account){
        System.out.print(account.getName()+"'s current ballance is "+account.getTotal()+"$");
        if(account.getLoan()>0)System.out.print(", Loan amount "+account.getLoan()+"$\n");
    }

    public void changeInterest(Account account, double rate){

    }
}
