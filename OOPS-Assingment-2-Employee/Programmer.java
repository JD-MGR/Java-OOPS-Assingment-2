

public class Programmer extends  Employee
{
    int experience;
  public Programmer(String name, String address, double salary, String job_title){
    super(name,address,salary,job_title);
    }
     public void calculateBonus(int experience) {
        this.experience=experience;
        salary+=salary * experience;
    }
    public void display(){
    System.out.println("Programmer Name : "+name);
    System.out.println("Programmer Branch : "+address);
    System.out.println("Programmer Salary : "+salary);
    System.out.println("Programmer Job : "+job_title);
    System.out.println("Programmer Experience : "+experience);
    }
}