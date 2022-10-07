package javaapplication3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); // System input
        
        System.out.print("Year of registration: "); // no new line
              
        int yearOfRegistration = s.nextInt(); // input from Scanner s
        
        int yearOfGraduation = yearOfRegistration + 4;
        System.out.println("Year of graduation: " + yearOfGraduation);
     
        
    }
    
}
