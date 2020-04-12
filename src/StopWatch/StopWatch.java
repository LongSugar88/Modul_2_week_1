package StopWatch;

public class StopWatch {
    public static void main(String[] args){

        StopWatchClass stopWatchClass = new StopWatchClass();
        MakeNumberArray makeNumberArray = new MakeNumberArray(100000);

        double myNuberArray[] = makeNumberArray.creatAnArray();
//        double myNuberArray[] = {8.0, 44.0, 25.0, 449.0 };

        System.out.println("My array before sorf");
        makeNumberArray.printArray(myNuberArray);

        stopWatchClass.setStartTime(System.currentTimeMillis());
            for (int i = 0; i < myNuberArray.length; i++) {
                double min = myNuberArray[i];
                int position = i;
                for(int j=i+1; j< myNuberArray.length; j++){
                    if (min > myNuberArray[j]) {
                        min = myNuberArray[j];
                        position = j;
                    }
                }
                double t = myNuberArray[i];
                myNuberArray[i] = min;
                myNuberArray[position] = t;
        }

        stopWatchClass.setEndTime(System.currentTimeMillis());
        System.out.printf("We need %s milliseconds to resolve this function. %n ", stopWatchClass.getElapseTime());

        System.out.println("My array after sorf");
        makeNumberArray.printArray(myNuberArray);

    }
}
