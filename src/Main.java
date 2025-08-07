import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Task> list = new ArrayList<>();

        list = imaginaryTasks.retList();

        for(Task p : list){
            System.out.print(p.toString());
        }

        }
    }
