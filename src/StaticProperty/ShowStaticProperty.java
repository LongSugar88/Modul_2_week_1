package StaticProperty;

public class ShowStaticProperty {
    public static void main (String[] args){
        StaticPropertyClass newObj1 = new StaticPropertyClass("Java", 60000000);
        System.out.println("No "+ StaticPropertyClass.rollNum + newObj1.getInfor() );
        StaticPropertyClass newObj2 = new StaticPropertyClass("PHP", 50000000);
        System.out.println("No "+ StaticPropertyClass.rollNum + newObj2.getInfor() );

    }
}
