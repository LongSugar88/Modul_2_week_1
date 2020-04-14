package StaticProperty;

public class StaticPropertyClass {
    public static int rollNum;
    private String name;
    private int price;
    public StaticPropertyClass(String name, int price){
        rollNum++;
        this.name = name;
        this.price = price;
    }
    public static int changeStaticProperty(int num){
        rollNum = num;
        return rollNum;
    }
    public String getInfor(){
        return " Name " + this.name + " price "+ this.price + "VNĐ";
    }
}
