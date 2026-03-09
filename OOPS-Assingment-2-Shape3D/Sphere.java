

public class Sphere extends Shapes
{
    int r;
    Sphere(int r){
    this.r=r;
}
 public void calculate_Volume(){
 int vol=(4/3)*(22/7)*r*r*r;
 System.out.println("Volume of Sphere : "+vol);
}
public void calculate_SurfaceArea(){
int area=4*(22/7)*r*r;
System.out.println("Surface Area of Sphere : "+area);
}
}