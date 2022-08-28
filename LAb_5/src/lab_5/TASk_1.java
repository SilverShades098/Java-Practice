/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;


class Circle
{
   private double radius;
  public Circle(double radius){
       this.radius=radius;
   }
   public void set_radius(double rr){
       this.radius=rr;
   }
      public double get_radius(){
       return radius;
   }
      public String toString()
      {
        return String.valueOf(radius);  
      }
      public double getArea()
      {
          return 3.14*radius*radius;
      }
}

class Cylinder extends Circle
{
   private double height;
 Cylinder(double radius,double hig){
     super(radius);
       this.height=hig;
   }
  
      public double get_height(){
       return height;
   }
   @Override
      public String toString()
      {
        return String.valueOf(height);  
      }
   @Override
      public double getArea()
      {
          return 2.0*Math.PI*this.get_radius()*this.height;
      }
      public double Get_volume(){
          return this.getArea()* this.get_height();
      }
      
}


public class TASk_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circle cr = new Cylinder(1.1, 2.2);
        System.out.println("radius of circle is :"+cr.toString());
    }
    }
    

