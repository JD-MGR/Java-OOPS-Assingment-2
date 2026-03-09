
public class Main
{
    public static void main(String args[]){ 
     Vehicle v=new Bike();
     v.start_Engine();
     v.stop_Engine();
     v=new Car();
     v.start_Engine();
     v.stop_Engine();
}
}