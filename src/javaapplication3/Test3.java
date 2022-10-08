package javaapplication3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); // System input
        
        System.out.print("Enter temperature in °F: ");
              
        double tempF = s.nextDouble();
        
        double tempC = (tempF - 32) / 1.8;
        
        System.out.println("Temperature in °C is: " + tempC);
    }
    
}

//        System.out.print("Enter temperature in °C: ");
//              
//        double tempC = s.nextDouble();
//        
//        double tempF = tempC * 1.8 + 32;
//        
//        System.out.println("Temperature in °F is: " + tempF);