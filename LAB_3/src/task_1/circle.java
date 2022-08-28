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
public class circle{
    private double radius ;
    private String color ;
    circle(){
        radius=1.0;
        color="red";
    }
    circle(double r){
        radius =r;
        color ="red";
         }
    circle(double ra,String col)
    {
        radius=ra;
        color=col;
    }
    public void set_Radius(double newRadius)
    {
       this.radius= newRadius;
    }
    public void set_color(String newColor){
        this.color= newColor;
    }
    public double get_radius()
    {
        return radius;
}
    public String get_color()
    {
        return color;
    }
}
