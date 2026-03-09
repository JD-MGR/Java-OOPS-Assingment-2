
/**
 * Write a description of class ElectronicsProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectronicsProduct
{     
    int product_id;
    int price;
    String name;
    ElectronicsProduct(int product_id,int price,String name){
    this.product_id=product_id;
    this.price=price;
    this.name=name;
    }
    public void discount(int rate){
    price-=(price*rate)/100;
    System.out.println("Discounted Price = "+price);
    }
}