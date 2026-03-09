
public class Smartphone
{
    private String brand;
    private String model;
    private int storage;
    public void set_Brand(String brand){
        this.brand=brand;
    }
    public void set_Model(String model){
        this.model=model;
    }
    public void set_Storage(int storage){
        this.storage=storage;
    }
    public String get_Brand(){
        return brand;
    }
    public String get_Model(){
        return model;
    }
    public int get_Storage(){
        return storage;
    }
}