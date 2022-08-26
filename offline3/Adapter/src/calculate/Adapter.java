package calculate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static calculate.Adder.print;

public class Adapter implements Calculate{
    @Override
    public int add(String filename){
        int a;
        List<Integer> array = new ArrayList<>();
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] strings;

                strings = line.split("~");
                int i = 0;
                try{
                    while (i < strings.length) {
                        a= Integer.parseInt(strings[i]);
                        array.add(a);
                        i++;
                    }
                }
                catch (Exception e) {
                    scanner.close();
                    System.out.println("Invalid Input Format.");
                    return 0;
                }

                System.out.println("Adapter being used.");

                return print(array);

            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred, File not found.");
            e.printStackTrace();
        }
        return 0;
    }
}
