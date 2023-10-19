/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author reality
 */
public class Inputter {

    public static Scanner sc = new Scanner(System.in);

    // Get an integer between min & max;
    public static int inputInt(String inputMsg, String errorMsg, int min, int max) {

        int output;
        if (min > max) {
            int tmp;
            tmp = min;
            min = max;
            max = tmp;

        }
        do {
            try {
                System.out.print(inputMsg);
                output = Integer.parseInt(sc.nextLine());
                if (output >= min && output <= max) {
                    return output;
                }

            } catch (Exception e) {
                System.out.println(errorMsg);

            }
        } while (true);

    }

    // Get a String with no conditions
    public static String inputStr(String inputMsg) {
        String output = "";
        System.out.print(inputMsg);
        output = sc.nextLine().trim();
        return output;

    }

    // Get a non blank String
    public static String inputNonBlankStr(String inputMsg, String errorMsg) {
        String output = "";
        System.out.println(inputMsg);

        do {
            output = sc.nextLine().trim();
            if (output.length() == 0 || output == null) {
                System.out.println(errorMsg);
            } else {
                return output;
            }
        } while (true);
    }

    // Get a String following a pattern;
    public static String inputPattern(String inputMsg, String errorMsg, String pattern) {
        String output;
        do {
            System.out.println(inputMsg);
            output = sc.nextLine().trim().toUpperCase();
            if (!output.matches(pattern)) {
                System.out.println(errorMsg);
            }

        } while (!output.matches(pattern));

        return output;
    }
    
    
    public static void main(String[] args) {
        // Kiểm tra hàm inputPattern
        
        System.out.println("----------");
        String s = inputPattern("Input ", "Wrong format", "[sS]\\d{3}");
        System.out.println(s);
    }

}
