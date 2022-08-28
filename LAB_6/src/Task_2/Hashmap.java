package Task_2;

import java.math.BigInteger;
import java.util.HashMap;

class Signature {}   class FingerPrint{}

class Citizen{
    String name;
    String Address;
    int contactNo;
    int familyNo;
    FingerPrint fr;// Non-Primitive Type
    Signature sign;// Non-Primitive Type  
    
    Citizen(String name, String adress, int contacNo,int familyNo,FingerPrint fr,Signature sign){
    this.name=name; this.Address=adress;
    this.contactNo=contacNo; this.familyNo=familyNo;
    this.fr=fr;  this.sign=sign;
    }
    @Override
    public String toString(){
    return ""+name+"\n"+ Address+"\n"+contactNo+"\n"+familyNo+"\n"+fr;
    }
}



public class Hashmap {
    public static void main(String []args){
        HashMap<BigInteger, Citizen> nadra = new HashMap<>();
        BigInteger c1 = new BigInteger("13302123156");
        FingerPrint f1 = new FingerPrint();
        Signature s1 = new Signature();
        Citizen a1 = new Citizen("saqib","khanpur",45,678,f1,s1);

        nadra.put(c1,a1);
        System.out.println(a1.toString());
        
         BigInteger c2 = new BigInteger("13302123156");
        FingerPrint f2 = new FingerPrint();
        Signature s2 = new Signature();
        Citizen a2 = new Citizen("pak","taxila",4,68,f1,s1);

        nadra.put(c2,a2);
        System.out.println(a2.toString());
       }
    
}
