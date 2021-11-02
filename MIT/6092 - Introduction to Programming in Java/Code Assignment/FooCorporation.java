/*
 * MIT Open Courseware
 * Intro to Programming in Java
 * 
 * Assignment 2: FooCorporation
 * Calculates pay of employees.
 * 
 * Assignments can be found at the following link: 
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */ 

import java.util.*;

public class FooCorporation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Employee 1\t: " + payment(35, 7.50));
        System.out.println("Employee 2\t: " + payment(47, 8.20));
        System.out.println("Employee 3\t: " + payment(73, 10.00));
 
    }
    public static double payment(double time, double payBase) {
        double pay = 0;
        if (time < 0 || time > 60) {
            System.out.println("Error: Type time value from 1 - 60");
            System.exit(0);
        }
        else if (payBase < 8.00) {
            System.out.println("Error: Your base pay less than the minimum wage ($8.00 an hour)");
        }
        else {
            if (time > 40) {
                double overtime = payBase * 1.5;
                pay = time * payBase * overtime;
            }
            else {
                pay = time * payBase;
            }
        }
        return pay;
    } // end of function
}
