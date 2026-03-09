

public class ResortReservation extends Reservation
{
  public int room_no;
  ResortReservation(int reservation_id,String customer_name,String date,int room_no){
    super(reservation_id,customer_name,date);
    this.room_no=room_no;
    }
    public void change_Room(int changed_room_no){
    this.room_no=changed_room_no;
    System.out.println("Customer "+customer_name+" Room number changed to : "+room_no+" on date : "+date);
}
}