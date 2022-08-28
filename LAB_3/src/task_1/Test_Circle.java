/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

/**
 *
 * @author zohaib computer
 */
public class Test_Circle {
    public static void main(String[] args)
    {
        circle c1=new circle();
        System.out.println("the circle has radius of :"+c1.get_radius()+"And color is:"+c1.get_color());
        circle c2 = new circle(2.0);
        System.out.println("the circle has radius of :"+c2.get_radius()+"and color is:"+c2.get_color());
        circle c3 = new circle(3.0,"brown");
        System.out.println("the circle has radius of :"+c3.get_radius()+"and color is:"+c3.get_color());
    }
    
}
