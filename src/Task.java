import java.util.*;

public class Task {

    private String name;
    private int time;

    public Task(String name, int time){
        this.name = name;
        this.time = time;
        if(time > 24){
            this.time = 24;
        }
        if(time < 0){
            this.time = 0;
        }
    }

    public void putName(String name){
        this.name = name;
    }

    public void putTime(int time){
        this.time = time;
        if(time > 24){
            this.time = 24;
        }
        if(time < 0){
            this.time = 0;
        }
    }

    public String getName(){
        return name;
    }

    public int getTime(){
        return time;
    }

    @Override
    public String toString(){
        return name + " " + time + "\n";
    }


}
