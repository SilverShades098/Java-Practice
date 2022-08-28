/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cylinder;

/**
 *
 * @author zohaib computer
 */
public class TestCylinder {
    public static void main(String [] args)
    {
     cylinder c1 = new cylinder();
     double pi=3.14;
     double area = ((2*22*c1.get_radius())/7)*(c1.get_radius()+c1.get_height());
     double volume = ((22*c1.get_radius()*c1.get_radius()*c1.get_height())/7);
     System.out.println("Area of the cylinder is :"+area+"\n/Volume of cylinder :"+volume);
     
    }
    
  
}
