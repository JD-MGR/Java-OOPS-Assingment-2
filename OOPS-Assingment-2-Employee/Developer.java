
public class Developer extends Employee
{
    int project;
 public Developer(String name, String address, double salary, String job_title){
    super(name,address,salary,job_title);
    }
    public void calculateBonus(int project) {
        this.project=project;
        salary+=salary * project/100;
    }
    public void display(){
    System.out.println("Developer Name : "+name);
    System.out.println("Developer Branch : "+address);
    System.out.println("Developer Salary : "+salary);
    System.out.println("Developer Job : "+job_title);
    System.out.println("Developer Project Count : "+project);
    }
}