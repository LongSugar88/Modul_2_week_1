package FanClass;

public class Fan {
    public static void main(String[] args){
        FanClass fan1 = new FanClass();
        FanClass fan2 = new FanClass();
//fan1
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOnOff(true);
//fan2
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOnOff(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
