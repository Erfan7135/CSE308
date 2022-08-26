package com.company;

public class Grade {

    public char getGrade(String cred, String num) {
        int credit;
        double n;
        try{
            credit = Integer.parseInt(cred);
            n = Double.parseDouble(num);
        }
        catch(Exception e){
            throw new IllegalArgumentException("Non number Input");
        }

        if(credit!=3 && credit!=4){
            throw new IllegalArgumentException("Invalid credit");
        }


        int number = (int) Math.ceil(n);
        if(number>400) {
            throw new IllegalArgumentException("Invalid number exceeded upper boundary");
        }
        if(number<0) {
            throw new IllegalArgumentException("Invalid number exceeded lower boundary");
        }
        if (credit == 3) {
            if (number >= 240) return 'A';
            if (number >= 210) return 'B';
            if (number >= 180) return 'C';
        } else if (credit == 4) {
            if (number >= 320) return 'A';
            if (number >= 280) return 'B';
            if (number >= 240) return 'C';
        }

        return 'F';
    }
}
