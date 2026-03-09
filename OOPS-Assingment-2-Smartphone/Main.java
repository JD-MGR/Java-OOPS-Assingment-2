
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main extends Mobile
{
    public static void main(String args[]){
     Mobile m=new Mobile();
     m.set_Brand("Samsung");
     m.set_Model("S26");
     m.set_Storage(128);
     System.out.println(m.get_Brand());
     System.out.println(m.get_Model());
     System.out.println(m.get_Storage());
     m.increase_Storage(128);
     System.out.println(m.get_Storage());
}
}