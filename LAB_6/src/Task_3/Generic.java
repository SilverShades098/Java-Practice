
package Task_3;

import java.util.ArrayList;

class WeightableItem{
    private double price_kg;
    private double Weight_implement;

    @Override
    public String toString()
{
  return "Price per kg = "+String.valueOf(this.price_kg)+"  Weight implement = "+String.valueOf(this.Weight_implement);
}
}

class item{
    private double price,quality;
    @Override
    
    public String toString()
{
  return "Price = "+String.valueOf(this.price)+"  Quantity = "+String.valueOf(this.quality);
}

    public item(double price, double quality) {
        this.price = price;
        this.quality = quality;
    }
}

class Printer2{
public static <T> void printArrayList(ArrayList<T> list){

    System.out.println(list.toString());
}
}

        
public class Generic {
   public static void main(String []args){
       
       ArrayList<item> list = new ArrayList<>();
       list.add(new item(7,8));
       list.add(new item(1,2));
       list.add(new item(6,3));
       Printer2.printArrayList(list);
   }       
    
}
