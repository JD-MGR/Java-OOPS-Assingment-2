class Employee {
    String name;
    String address;
    double salary;
    String job_title;

    public Employee(String name, String address, double salary, String job_title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }
    public void calculateBonus(int percent) {
         salary+=salary * percent/10;
    }
    public void display(){
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Branch : "+address);
    System.out.println("Employee Salary : "+salary);
    System.out.println("Employee Job : "+job_title);
    }
}