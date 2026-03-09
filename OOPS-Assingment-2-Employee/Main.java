
public class Main
{
    public static void main(String[] args){
    Employee e=new Employee("Ganesh","Tharuvai",8000,"Manager");
    e.calculateBonus(20);
     e.display();
    System.out.println();
    e=new Employee("Mani","Chennai",40000,"Developer");
    e.calculateBonus(10);
    e.display();
    System.out.println();
    e=new Employee("Vijay","Surandai",25000,"Programmer");
    e.calculateBonus(5);
     e.display();
    System.out.println();
    e=new Manager("Ganesh","Tharuvai",8000,"Manager");
    e.calculateBonus(20);
     e.display();
    System.out.println();
    e=new Developer("Mani","Chennai",40000,"Developer");
    e.calculateBonus(10);
     e.display();
    System.out.println();
    e=new Programmer("Vijay","Surandai",25000,"Programmer");
    e.calculateBonus(5);
     e.display();
    System.out.println();
    }
}