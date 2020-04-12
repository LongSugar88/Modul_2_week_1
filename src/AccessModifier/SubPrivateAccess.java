package AccessModifier;
public class  SubPrivateAccess extends AccessModifier {
    int age = 6;
    public static void main(String args[]) {
        SubPrivateAccess sub = new SubPrivateAccess();
        //    private not allowed here
//        System.out.println(sub.getInforProtected());
    }
}
