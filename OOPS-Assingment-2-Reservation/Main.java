
public class Main
{
public static void main(String args[]){
    ResortReservation resort=new ResortReservation(101,"Ganesh","08-10-2026",56);
    RailwayReservation rail=new RailwayReservation(101,"Ganesh","09-10-2026",89);
    resort.change_Room(69);
    rail.change_Seat(67);
}
}