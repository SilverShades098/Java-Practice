import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class testClass {

    public static void main(String[] args) throws ParseException {

            String dated="22/05/2018";  
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dated);    
            Visit v=new Visit(date,2,367.2,765.7);
            customer c1=new customer("Jamshaid",v,7);
            c1.printBill();
            dated="14/07/2015";  
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dated); 
            v=new Visit(date,4,638.7,851.5);
            premiumCustomer p1=new premiumCustomer("Jimmy",v,9);
            p1.addVisit(v);
            p1.printBill();
            dated="28/03/2017";  
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dated);    
            v=new Visit(date,6,593.5,473.6);
            p1.addVisit(v);
            premiumCustomer p2=new premiumCustomer("JJ",v,5);        
            p2.printBill();
            p1.printCustomerHistory();
       
    }
}

