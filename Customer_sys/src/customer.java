import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class customer {
  private String name;
  Visit v;
  ArrayList<Visit> visitList = new ArrayList<>();
    
  public customer(String name,Visit v,int visits) {
    this.name=name; 
    this.v=v; 
    v.setVisits(visits);
  }

  public double getTotalExpense() {
    return v.serviceCharges+v.productCharges;  
  }        
  
 
    public void setName(String name) {
        this.name = name;
    }

    public void setV(Visit v) {
        this.v = v;
    }

    public void setVisitList(ArrayList<Visit> visitList) {
        this.visitList = visitList;
    }
  
  public void printBill() {
      System.out.println(this.toString(v.date,"Customer")+"\nTotal: "+this.getTotalExpense());   
  }        

    public String getName() {
        return name;
    }

    public Visit getV() {
        return v;
    }

    public ArrayList<Visit> getVisitList() {
        return visitList;
    }
  public String toString(Date d,String customer_type) {
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");    
     String dated = dateFormat.format(d); 
     return 
    "Customer Name: "+name+"\nMemberShip: "+customer_type+
     "\tNo of Visit: "+v.getVisits()+"\nDate: "+dated+
     "\nServices Charges: "+v.getServiceCharges()+
     "\nProduct Charges: "+v.getProductCharges();
  }    
}





