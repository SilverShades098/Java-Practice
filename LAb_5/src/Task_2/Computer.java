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
public class Computer {
private String os;
private int ram,hd;
public Computer(String os, int hd, int ram){
    this.hd=hd;this.ram=ram;this.os=os;
} 
public String Get_os(){
    return os;
}
public int Get_hd(){
    return hd;
}
public int Get_ram(){
    return ram;
}
}
class pc extends Computer{
    private int wt;
    public pc(String os, int hd , int ram,  int wta){
        super(os,hd,ram);
        this.wt=wta;
    }
    public int get_wt(){
        return this.wt;
    }
}
class laptop extends Computer{
    private int Bt_tm;
    	public laptop( String os, int hd , int ram,  int Bt_tm){  
            super(os,hd,ram);
            this.Bt_tm=Bt_tm;
            
}
        public int Get_bt(){
            return this.Bt_tm;
        }
}
class ComputerTest
{
  public static void main(String args[])
  {
  Computer c=new Computer("windows-xp",60,1);//a Computer instance
  System.out.println(c.getClass());
  System.out.println("computer has "+c.Get_os()+ " operating system " + c.Get_hd() + "GB harddisk and "+c.Get_ram()+ "GB RAM\n");//call all Computer Class methods
  
  pc p=new pc("linux",60,1,5);// A PC class instance
   System.out.println(p.getClass());
  System.out.println("PC has "+p.Get_os() + "  operating system " + p.Get_hd() + "GB hardrdisk "+p.Get_ram()+ "GB RAM and "+ p.get_wt()+"years warranty timing\n");//call all PC class methods
  
  laptop l=new laptop("windows-vista",60,1,3);// A Laptop Class instance 
   System.out.println(l.getClass());
  System.out.println("laptop has "+l.Get_os() + " operating system " + l.Get_hd() + "GB harddisk and "+l.Get_hd()+ "GB RAM and"+ l.Get_bt()+ "hrs battery timing");
  
  c=p; //implicit upcast PC object to a Computer Class Object
  System.out.println(p.getClass());
  System.out.println("PC has "+p.Get_os() + "  operating system " + p.Get_hd() + "GB hardrdisk"+p.Get_ram()+ "GB RAM and "+((pc)p).get_wt()+"years warranty timing\n");

//have to downcast to call a PC class method that were not overriden
  c=l;
  System.out.println(l.getClass());
  System.out.println("laptop has "+l.Get_os() + " operating system " + l.Get_hd() + "GB harddisk and "+l.Get_ram()+ "GB RAM and"+ ((laptop)l).Get_bt()+ "hrs battery timing");
  
   pc p1=new pc("mac-os",60,1,5);
   if (c.equals(p))
   System.out.println(c.getClass() + " and " + p.getClass() + " are the same.");
   else
   System.out.println(c.getClass() + " and " + p.getClass() + " are different.");  
   if (c.equals(p1))
   System.out.println(c.getClass() + " and " + p1.getClass() + " are the same.");
   else
   System.out.println(c.getClass() + " and " + p1.getClass() + " are different."); 

  }
}
