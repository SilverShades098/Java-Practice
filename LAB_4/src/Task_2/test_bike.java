/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_2;

/**
 *
 * @author zohaib.computer
 */
public class test_bike {
public static void main(String [] args){
BIKE b1 = new BIKE("red",2);    
System.out.println("bike color :"+b1.get_color()+"\nBike wheels : "+b1.get_wheel());
Honda h1 =new Honda("white",2);
h1.Start_Engine();

}
}