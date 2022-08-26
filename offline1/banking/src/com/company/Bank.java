package com.company;

import java.util.ArrayList;
import java.util.Hashtable;

public class Bank {
    Hashtable<String,String> Username ;
    ArrayList<Account> acc;
    ArrayList<Employee> emp;
    double total_fund;

    Bank(){
        Username = new Hashtable<>();
        acc = new ArrayList<>();
        emp = new ArrayList<>();
        total_fund=1000000;
        System.out.print("Bank created; ");
        createEmployee("MD","MD");
        System.out.print("MD, ");
        for(int i=1;i<3;i++){
            createEmployee("O"+i,"Officer");
            System.out.print("O"+i+", ");
        }
        for(int i=1;i<6;i++){
            createEmployee("C"+i,"Cashier");
            System.out.print("C"+i+", ");
        }
        System.out.print("created. \n");
    }


    public Account createAccount(String name, String type, double total){
        if (Username.contains(name))
            return null;
        if (type.equals("STUDENT")) {
            Account account = new Student(name, total);
            acc.add(account);
            return account;
        }
        else if (type.equals("SAVINGS")) {
            Account account = new Savings(name, total);
            acc.add(account);
            return account;
        }
        else if (type.equals("FIXEDDEPOSIT")) {
            Account account = new fixedDeposit(name, total);
            acc.add(account);
            return account;
        }
        else if (type.equals("LOAN")) {
            Account account = new fixedDeposit(name, total);
            acc.add(account);
            return account;
        }
        return null;
    }

    public void logout(Employee employee,Account account){
        if(account!=null) System.out.println("Transaction closed for "+account.getName());
        if(employee!=null) System.out.println("Operation closed for "+employee.getName());
        return;
    }

    public Employee createEmployee(String name,String type){
        Employee employee=null;
        if(type.equals("MD")){
            employee =  new MD(name,"MD");
        }
        else if(type.equals("Officer")){
            employee = new  Officer(name,"Officer");
        }
        else if(type.equals("Cashier")){
            employee = new Cashier(name,"Cashier");
        }
        emp.add(employee);
        return employee;
    }

    public Account login(String name) {
        for(int i=0;i<acc.size();i++){
            if(acc.get(i).getName().equals(name)){
                System.out.println("Previous user or account closed. "+name+" activated.");
                return acc.get(i);

            }
        }
        return null;
    }

    public Employee employeeLogin(String name){
        for(int i=0;i<emp.size();i++){
            if(emp.get(i).getName().equals(name)){
                System.out.println("Previous user or account closed. "+name+" Opened.");
                return emp.get(i);
            }
        }
        return null;
    }

    public void deposit(Account account,int amount) {
        account.deposit(amount);
        total_fund+=amount;
    }

    public void withdraw(Account account, int amount) {
        account.withdraw(amount);
        total_fund-=amount;
    }

    public void approveLoan(Employee employee) {
        if(employee==null){
            System.out.println("No Employee to approve Loan");
            return;
        }
        if(employee.getType().equals("Cashier")){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        int a=0;
        for(int i=0;i<acc.size();i++){
            double pending = acc.get(i).getPending();
            if(pending != 0.00){
                acc.get(i).update();
                total_fund-=pending;
                System.out.println("Loan for "+acc.get(i).getName()+" approved.");
                a++;
            }
        }
        if(a==0)System.out.println("No pending loan request to approve.");
    }

    public void lookupCustomer(Employee employee,String name){
        if(employee==null){
            System.out.println("No Employee to Look Up");
            return;
        }
        for(int i=0;i<acc.size();i++){
            String user = acc.get(i).getName();
            if(user.equals(name)){
                employee.LookUP(acc.get(i));
            }
        }
    }

    public void changeInterest(Employee employee,String type, double rate){
        for(int i=0;i<acc.size();i++){
            if(acc.get(i).getType().equals(type)){
                employee.changeInterest(acc.get(i),rate);
            }
        }

    }


    public void seeFund(Employee employee) {
        if(employee.getType().equals("MD")){
            System.out.println("Total Internal Funds : "+total_fund+"$");
            return;
        }
        else{
            System.out.println("You don’t have permission for this operation");
            return;
        }
    }

    public void incrementYear() {
        for(int i=0;i<acc.size();i++){
            Account account = acc.get(i);
            double loanInterest = account.getLoan()* account.getLoanRate();
            if(acc.get(i).getType().equals("LOAN")){
                total_fund+=loanInterest;
                account.updateFund(loanInterest);
            }
            else{
                double interest = (account.getTotal())* account.getRate();
                total_fund = total_fund - interest + loanInterest;
                account.updateFund(interest - loanInterest);

            }
            account.increment();

        }
        System.out.println("1 year passed.");
    }


}
