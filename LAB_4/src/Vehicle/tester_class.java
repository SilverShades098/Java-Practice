/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author zohaib computer
 */
public class tester_class {
     public static void main(String args[])
    {
   Automobile a1 = new Automobile();
   a1.start();
   a1.setgear(3);
   System.out.println("Gear of the vehical is :"+a1.getgear());a1.accelerate();
   a1.rightturn();a1.applybreaks();
   System.out.println("Speed is :"+a1.showspeed());
   a1.stop();
    }
    
}
