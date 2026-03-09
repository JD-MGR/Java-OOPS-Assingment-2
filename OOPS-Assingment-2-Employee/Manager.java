
public class Manager extends Employee
{
    int team_count;
public Manager(String name, String address, double salary, String job_title){
    super(name,address,salary,job_title);
}
    public void calculateBonus(int team_count) {
        this.team_count=team_count;
        salary+= salary * team_count/10;
    }
    public void display(){
    System.out.println("Manager Name : "+name);
    System.out.println("Manager Branch : "+address);
    System.out.println("Manager Salary : "+salary);
    System.out.println("Manager Job : "+job_title);
    System.out.println("Manager Team Members : "+team_count);
    }
}