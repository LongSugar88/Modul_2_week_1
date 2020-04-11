package StopWatch;


public class MakeNumberArray {
    private int size;
    public MakeNumberArray(int size ){
        this.size = size;
    }
    public double[] creatAnArray(){
        final int SIZE = size;
        double myNuberArray[] = new double[SIZE];
        for (int i=0; i< myNuberArray.length; i++){
            myNuberArray[i] = Math.floor(Math.random()*999);
        }
        return myNuberArray;
    }
    public void printArray(double[] myArray){
        for (int i=0; i<myArray.length; i++){
            System.out.print( myArray[i]+ " ");
        }
        System.out.println();
    }
}
