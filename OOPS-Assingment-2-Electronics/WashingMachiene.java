
/**
 * Write a description of class WashingMachiene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WashingMachiene extends ElectronicsProduct
{
    int warranty;
    WashingMachiene(int product_id,int price,String name,int warranty){
    super(product_id,price,name);
    this.warranty=warranty;
    }
    public void extend_Warranty(int extend){
    this.warranty+=extend;
    System.out.println("Extended Warranty = "+warranty);
    }
   
}