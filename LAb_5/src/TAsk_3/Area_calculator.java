/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAsk_3;

import java.util.Scanner;

/**
 *
 * @author zohaib computer
 */
public class Area_calculator {
   
    public double calculateArea(double length,double width)
    {
        return length*width;
    }
    
    public double calculateArea(double a,double b,double c)
    {
        double s1=(a+b+c)/2;
        double area=s1*(s1-a)*s1*(s1-b)*s1*(s1-c);
        
        return Math.sqrt(area);   
    }

public double calculateArea(double radius)
{
    return Math.PI*radius*radius;
}
}

class tester
{
    public static void main(String []args)
    {
        Area_calculator a = new Area_calculator();
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the choice\n1for Rectangle,2 for triangle and 3 for circle\n\n");
        int n=i.nextInt();
        if(n==1)
        {
           System.out.println("Area for rectangle  = "+a.calculateArea(6.8,3.98));
        }
        if(n==2)
        {
           System.out.println("Area for triangle  = "+a.calculateArea(6.8,3.98,7.9));
        }
        if(n==3)
        {
           System.out.println("Area for Circle  = "+a.calculateArea(6.8));
        }
    }       
}