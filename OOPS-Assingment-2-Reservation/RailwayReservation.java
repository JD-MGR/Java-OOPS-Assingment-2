

public class RailwayReservation extends Reservation
{
public int seat_no;
 RailwayReservation(int reservation_id,String customer_name,String date,int seat_no){
    super(reservation_id,customer_name,date);
    this.seat_no=seat_no;
    }
    public void change_Seat(int updated_seat_no){
    this.seat_no=updated_seat_no;
    System.out.println("Customer "+customer_name+" seat no updated to : "+seat_no+" on date : "+date);
    }
}