package StaticMethod;

public class StaticMethod {
    public static String name;
    public static int age;
    public static void setname(){
        name ="Long";
    }
    public static void setAge(){
        age = 27;
    }
    public void showNme(){
        System.out.println("this name is "+ name);
    }
    public void showAge (){
        System.out.println("this age is "+ age);
    }
}
class UsingStaticMethod{
    public static void main(String[] args){
        //using static method change name and age with out creat new object
        StaticMethod.setname();
        StaticMethod.setAge();
        //creat new object to using them's method
        StaticMethod newObj = new StaticMethod();
        newObj.showNme();
        newObj.showAge();
    }
}
