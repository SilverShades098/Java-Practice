/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4;

/**
 *
 * @author zohaib computer
 */
class bechlor {
    private int tot_marks,ob_marks;
    private String Degree_name,nameFYP;
    public void settotmarks(int tot_marks)
    {
        this.tot_marks=tot_marks;
    }
    public int  gettotmarks()
    {
        return tot_marks;
    }
    public void setobmarks(int ob_marks)
    {
        this.ob_marks=ob_marks;
    }
    public int getobmarks()
    {
        return ob_marks;
    }

    public void setdegree(int dg)
    {
        this.tot_marks=dg;
    }
    public String getdegree()
    {
        return this.Degree_name;
    }
    public void setfyp(String fyp)
    {
        this.nameFYP=fyp;
    }
    public String getfyp()
    {
        return this.nameFYP;
    }

    public double Percentage_1(){
        return (this.getobmarks()/this.getobmarks())*100;
    }
    
    
}
class Intermediate extends bechlor{
private int tot_marks,ob_marks;
private String Degree_name;
private String s1,s2,s3;
  
@Override
public void settotmarks(int tot_marks)
    {
        this.tot_marks=tot_marks;
    }
@Override
    public int  gettotmarks()
    {
        return tot_marks;
    }
@Override
    public void setobmarks(int ob_marks)
    {
        this.ob_marks=ob_marks;
    }
@Override
    public int getobmarks()
    {
        return ob_marks;
    }

    public void setdegree(String dg)
    {
        this.Degree_name=dg;
    }
@Override
    public String getdegree()
    {
        return this.Degree_name;
    }
    public void sets1(String s1)
    {
        this.s1=s1;
    }
    public String gets1()
    {
        return this.s1;
    }

    public void sets2(String s2)
    {
        this.s2=s2;
    }
    public String gets2()
    {
        return this.s2;
    }

        public void sets3(String s3)
    {
        this.s3=s3;
    }
    public String gets3()
    {
        return this.s3;
    }

    
public double Percentage_2(){
        return (this.getobmarks()/this.gettotmarks())*100;        
    }
}
class master extends bechlor{
private int tot_marks,ob_marks;
private String Degree_name;
private String nm_thesis;

@Override
    public void settotmarks(int tot_marks)
    {
        this.tot_marks=tot_marks;
    }
@Override
    public int  gettotmarks()
    {
        return tot_marks;
    }
@Override
    public void setobmarks(int ob_marks)
    {
        this.ob_marks=ob_marks;
    }
@Override
    public int getobmarks()
    {
        return ob_marks;
    }


    public void setdegree(String dg)
    {
        this.Degree_name=dg;
    }
@Override
    public String getdegree()
    {
        return this.Degree_name;
    }
    public void setnm_thesis(String nm_thesis)
    {
        this.nm_thesis=nm_thesis;
    }
@Override
    public String getfyp()
    {
        return this.nm_thesis;
    }


  public int Percentage_3(){
                int a=this.getobmarks()/this.gettotmarks()*100;
                return a;
    }
}

abstract class Qualification
{
    
private int tot_marks,ob_marks;
private String Degree_name;
abstract double Percentage();

}

class Test_bachlor{
public static void main(String [] args){
    master m = new master();
    m.setdegree("BSC(HONS)");
    System.out.println("Name of degree:"+m.getdegree());
    m.setobmarks(45);
    System.out.println("Obtain marks"+m.getobmarks());
    m.settotmarks(100);
    System.out.println("Total marks:"+ m.gettotmarks());
    System.out.println("Percentage:"+ m.Percentage_3());


}
}


