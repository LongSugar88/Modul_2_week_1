package AccessModifier;

    public class AccessModifier {
        private int age=6 ;
        public static double weight = 10.5;
        public String message(){
            return "Super";
        }
        public AccessModifier(){
            System.out.println("Private");
        }
        private void setAge(int age){
            this.age = age;
        }
        private int getAge(){
            return this.age;
        }
//        protected String getInforProtected() {
//            return "This is protected access";
//        }
        protected void getInforProtected() {
            System.out.println("This is protected access");
        }
        String getInforDefault() {
            return "This is default access";
        }
}

