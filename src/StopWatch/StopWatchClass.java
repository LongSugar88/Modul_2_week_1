package StopWatch;

import java.util.Date;

public class StopWatchClass {
    private long startTime, endTime;

    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }

    public StopWatchClass( ){

    }
    public long start(){
        long startTime = System.currentTimeMillis();
        this.startTime = startTime;
        return this.startTime;
    }
    public long stop(){
        long stopTime = System.currentTimeMillis();
        this.endTime = stopTime;
        return this.endTime;
    }
    public long getElapseTime(){
        return this.endTime - this.startTime ;
    }
}
