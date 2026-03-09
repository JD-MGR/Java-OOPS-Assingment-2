
public class CustomerOrder
{
   public int order_id; 
   public String customer_name;
   public String order_date;
   CustomerOrder(int order_id,String customer_name,String order_date){
    this.order_id=order_id;
    this.customer_name=customer_name;
    this.order_date=order_date;
    }
}