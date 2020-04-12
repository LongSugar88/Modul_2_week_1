package AccessModifier;

class SubDefaultAccess {
    public static void main(String args[]) {
        SubPrivateAccess sub = new SubPrivateAccess();
        //alloed here because in same package
        System.out.println(sub.getInforDefault());
    }
}

