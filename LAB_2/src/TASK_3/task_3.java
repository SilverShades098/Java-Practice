/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TASK_3;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class task_3 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vlaue of A :");
        double a= scanner.nextDouble();
        System.out.println("Enter vlaue of B :");
        double b= scanner.nextDouble();
        System.out.println("Enter vlaue of C :");
        double c= scanner.nextDouble();
        double root1 = 0;
        double root2 = 0;
        double discriminent=b*b-4*a*c;
        if (discriminent== 0)
        {
            System.out.println("Roots are equal ____");
            root1= -b/(2*b);
            root2= -b/(2*b);
    }
        if (discriminent < 0)
        {
            System.out.println("Roots are imaginiray....");
        }
        if(discriminent > 0)
        {
            System.out.println("Roots are equal ____");
            root1 = (-b + Math.pow(discriminent,1/2))/(2*a));
            root2 = (-b - Math.pow(discriminent,1/2))/(2*a));
                 }
            System.out.println("Roots of the quadratic equ is");
            System.out.println("Root 1 :"+ root1);
            System.out.println("Roots 2 :"+ root2);
        }
}
