
public class Car extends Vehicle
{
    boolean is_repair;
    Car(boolean is_repair){
    this.is_repair=is_repair;
    }
    public void drive(){
    if(is_repair==true) System.out.println("Car is Repair");
    else System.out.println("Car is Running");
    }
}