/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_2;

/**
 *
 * @author zohaib computer
 */
public class BIKE {
    private String color;
    private int wheel;
    BIKE(String color,int wheel){
    this.color=color;
    this.wheel=wheel;
}
    public void set_color(String col){
        this.color=col;
    }
    public void Set_wheel(int w){
        this.wheel=w;
    }
    public String get_color(){
        return color;
    }
    
    public int get_wheel(){
        return wheel;
    }
    
    

}
class Honda extends BIKE{
        private String Honda_engin;

    public Honda(String color, int wheel) {
        super(color, wheel);
    }
        public void Start_Engine(){
            HondaEngine h=new HondaEngine();
            h.start();
        }
    }

class HondaEngine
{
    public void start()
    {
      System.out.print("Honda Started\n");
    }
    public void stop()
    {
      System.out.print("Honda Stopped\n");        
    }
}
