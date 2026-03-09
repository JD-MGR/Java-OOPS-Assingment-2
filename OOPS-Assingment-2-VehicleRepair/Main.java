
public class Main
{
    public static void main(String[] args){
    Vehicle v=new Vehicle();
    v.drive();
    v=new Car(false);
    v.drive();
    v=new Car(true);
    v.drive();
    }
}