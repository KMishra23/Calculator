package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
class Calculator {
    public float add(float a, float b) {
        return a+b;
    }
    public float sub(float a, float b) {
        return a-b;
    }
    public float mul(float a, float b) {
        return a*b;
    }
    public float div(float a, float b) {
        return a/b;
    }
}
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("We about to Calculate ni-");

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int sel = 1; float a, b;
//        while(true) {
            System.out.println("Enter an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. exit");
            sel = sc.nextInt();
            System.out.println("Enter 1st Number");
            a = sc.nextFloat();
            System.out.println("Enter 2nd Number");
            b = sc.nextFloat();
            switch (sel) {
                case 1:
                    float add = calc.add(a, b);
                    System.out.println("Sum is: " + add);
                    break;

                case 2:
                    float sub = calc.sub(a, b);
                    System.out.println("Difference is: " + sub);
                    break;

                case 3:
                    float mul = calc.mul(a, b);
                    System.out.println("Product is: " + mul);
                    break;

                case 4:
                    float div = calc.div(a, b);
                    System.out.println("Quotient is: " + div);
                    break;

                case 5:
                    System.out.println("Thanks for using!");
            }
//            if(sel == 5) {
//                break;
//            }
//        }
//        System.out.println("Thanks for using!");
    }
}