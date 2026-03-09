

public class Main
{
 public static void main(String[] args){
    WashingMachiene w=new WashingMachiene(102,20000,"Bosch Tornado",3);
    System.out.println("Original Price = "+w.price);
    w.discount(20);
    System.out.println("Warranty = "+w.warranty);
    w.extend_Warranty(2);
    }
}