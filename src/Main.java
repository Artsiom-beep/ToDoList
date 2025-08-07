import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Task> list = imaginaryTasks.retList();


        List<Task> list2 = list.stream()
                .filter(t -> t.getTime() < 12)
                .filter(t -> t.getTime() > 6)
                //.map(t -> new Task(t.getName(), t.getTime() + 12))
                .sorted()
                .collect(Collectors.toList());



        for(Task p : list2){
            System.out.print(p.toString());
        }


        try {
            long list2amount = list2.stream()
                    .count();
            analizeSituation.analizeSituation(list2amount);
        }
        catch(MyException e){
            System.out.println("YOU ARE LAZY PIECE OF SHIT!!!");
        }




        }
    }
