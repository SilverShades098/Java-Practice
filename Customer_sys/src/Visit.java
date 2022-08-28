/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit 
{
  Date date;
  private int visits;
  double serviceCharges,productCharges;
  
  public int getVisits() {
        return visits;
    }

  public void setVisits(int visits) {
        this.visits = visits;
    }
  
  public Visit(Date date,int visits,double serviceCharges,double productCharges)
  {
    this.date=date; this.serviceCharges=serviceCharges;
    this.productCharges=productCharges; this.visits=visits;
  }        
    
  public double getServiceCharges() {
        return serviceCharges;
    }

  public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

  public double getProductCharges() {
        return productCharges;
    }

  public void setProductCharges(double productCharges) {
        this.productCharges = productCharges;
    }
  
  public String toString() {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");    
      String dated = dateFormat.format(date);  
      return "Service Charges: "+serviceCharges+ "\nProduct Charges: "
      +productCharges+"\nDate: "+dated;
  }    
           
}




