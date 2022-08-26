package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank();
        Account current = null;

        Employee employee = null;

        Scanner scan = new Scanner(System.in);

        try(BufferedReader reader = new BufferedReader(new FileReader("input.in"))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] inputs = line.split(" ");
                System.out.print(line+ "--");
                switch (inputs[0].toLowerCase()){
                    case "create":
                        current = bank.createAccount(inputs[1], inputs[2].toUpperCase(), Double.parseDouble(inputs[3]));
                        break;
                    case "deposit":
                        bank.deposit(current,Integer.parseInt(inputs[1]));
                        break;
                    case "withdraw":
                        bank.withdraw(current,Integer.parseInt(inputs[1]));
                        break;
                    case "query":
                        current.checkBalance();
                        break;
                    case "request":
                        current.reqLoan(Integer.parseInt(inputs[1]));
                        break;
                    case "close":
                        bank.logout(employee,current);
                        employee=null;
                        current=null;
                        break;
                    case "open":
                        employee = bank.employeeLogin(inputs[1]);
                        current = bank.login(inputs[1]);
                        break;
                    case "approve":
                        bank.approveLoan(employee);
                        break;
                    case "lookup":
                        bank.lookupCustomer(employee,inputs[1]);
                        break;
                    case "change":
                        bank.changeInterest(employee,inputs[1].toUpperCase(), Double.parseDouble(inputs[2]));
                        break;
                    case "see":
                        bank.seeFund(employee);
                        break;
                    case "inc":
                        bank.incrementYear();
                        break;
                    default:
                        // do nothing
                        break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }

}
