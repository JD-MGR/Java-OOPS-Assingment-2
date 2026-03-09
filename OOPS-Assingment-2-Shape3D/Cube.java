
public class Cube extends Shapes
{
    int s;
    Cube(int s){
    this.s=s;
}
 public void calculate_Volume(){
 int vol=s*s*s;
 System.out.println("Volume of Cube : "+vol);
}
public void calculate_SurfaceArea(){
int area=6*s*s;
System.out.println("Surface Area of Cube : "+area);
}
}