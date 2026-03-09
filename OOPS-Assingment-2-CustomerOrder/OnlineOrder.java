
/**
 * Write a description of class OnlineOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OnlineOrder extends CustomerOrder
{
 String delivery_address;
 int tracking_number;
 OnlineOrder(int order_id,String customer_name,String order_date,String delivery_address,int tracking_number){
    super(order_id,customer_name,order_date);
    this.delivery_address=delivery_address;
    this.tracking_number=tracking_number;
}
public void delivery_Time(){
 switch(this.delivery_address){
    case "Tirunelveli":
    System.out.println("1 day");
    break;
    case "Chennai":
    System.out.println("5 days");
    break;
    case "Srivilliputhur":
    System.out.println("3 days");
    break;
    case "Peravoorani":
    System.out.println("3 days");
    break;
    }
}
}