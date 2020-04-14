package AccessModifierOutside;

import AccessModifier.AccessModifier;

class subProtected extends AccessModifier {
    public static void main(String[] args) {
        subProtected subModifier = new subProtected();
//        allowed here because its protected modifier
        subModifier.getInforProtected();
    }
}
