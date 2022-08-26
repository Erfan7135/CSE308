package calculate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adder implements Calculate {
    @Override
    public int add(String filename){
        List<Integer> array = new ArrayList<>();
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println(data);
                String[] strings;

                strings = line.split(" ");
                try{
                    Integer.parseInt(strings[0]);
                }
                catch (Exception e) {
                    scanner.close();
                    Adapter adapter = new Adapter();
                    return adapter.add(filename);
                }
                int i = 0;
                try{
                    while (i < strings.length) {
                        int a= Integer.parseInt(strings[i]);
                        array.add(a);
                        i++;
                    }
                }
                catch (Exception e) {
                    scanner.close();
                    System.out.println("Invalid Input Format.");
                    return 0;
                }




                return print(array);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred. File not found.");
            e.printStackTrace();
        }
        return 0;
    }


    static int print(List<Integer> array) {
        int sum=0;
        for(int j=0;j<array.size();j++) {
            if(j!=0)System.out.print(" + ");
            System.out.print(array.get(j));
            sum+=array.get(j);
        }

        System.out.println(" : "+sum);
        return sum;
    }
}

