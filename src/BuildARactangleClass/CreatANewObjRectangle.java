package BuildARactangleClass;

public class CreatANewObjRectangle {
    public static void main(String[] args){
        BuildRectangleClass myRactangle = new BuildRectangleClass(10,5);
        System.out.println(myRactangle.display());
        System.out.printf("Diện tích của hình chữ nhật là %20s %n ", myRactangle.getArea());
        System.out.printf("Chu vi của hình chữ nhật là %20s %n", myRactangle.getParameter());
    }
}
