package com.bsu.by;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try(Scanner fileScanner = new Scanner(new File("input.txt"))){
            while(fileScanner.hasNext()){
                String ip = fileScanner.nextLine();
                if(isIPv4(ip)){
                    System.out.println(ip + " is valid");
                } else {
                    System.out.println(ip + " is not valid");
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static boolean isIPv4(String number){
        boolean isReg = false;
        String regex1 = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
        isReg = Pattern.matches(regex1,number);
        return isReg;
    }
}
