package AccessModifierOutside;

import AccessModifier.AccessModifier;

class subProtected extends AccessModifier {
    public static void main(String args[]) {
        AccessModifier subprotectedModifier = new AccessModifier();
        //test protected modifier
        System.out.println(subprotectedModifier);
        //allowed here because its public modifier
//        System.out.println(subprotectedModifier.getInforProtected());
    }
}
