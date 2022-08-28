
import java.util.ArrayList;
public class premiumCustomer extends customer implements Discountable 
{
  public premiumCustomer(String name, Visit v,int visits) {
    super(name,v,visits);
  }
  @Override
    public void setV(Visit v) {
        this.v = v;
    }
  @Override
    public void setVisitList(ArrayList<Visit> visitList) {
        this.visitList = visitList;
    }
  @Override
    public Visit getV() {
        return v;
    }
  @Override
    public ArrayList<Visit> getVisitList() {
        return visitList;
    }
  public void addVisit(Visit visit) {
    super.visitList.add(visit);
  }
  public void printCustomerHistory() {
    System.out.println("Customer History\n");  
    int a=0;
    for(Visit i:super.visitList) {   
        System.out.print(super.visitList.get(a++)+"     ");
    }
  }

  @Override
  public void printBill() { 
    System.out.println("Bill\n\n"+super.toString(v.date,"Premium Customer")+
    "Total "+this.getTotalExpense());
  }
  @Override
  public double getTotalExpense() {  
      return super.getTotalExpense()-this.discount();
  }
  @Override
  public double discount() {
    return super.getTotalExpense()*setDiscountRate();   
  }
  
  public double setDiscountRate() {
    return premiumDiscountRate;  
  }
    
}
