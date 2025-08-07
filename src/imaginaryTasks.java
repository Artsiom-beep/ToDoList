import java.util.*;
public class imaginaryTasks {

    private static List<Task> list = new ArrayList<>();
    static {
        Task codetask = new Task("Write code", 12);
        Task washDishes = new Task("Wash Dishes", 9);
        Task learnEnglish = new Task("Learn English", 11);
        Task playCS2 = new Task("Play CS2", 22);
        Task takeShower = new Task("Take Shower", 20);
        Task eatPork = new Task("Eat Pork", 25);
        Task doMath = new Task("Do Math", 8);
        Task singAwfully = new Task("SingAwfully", 0);


        list.add(codetask);
        list.add(washDishes);
        list.add(learnEnglish);
        list.add(playCS2);
        list.add(takeShower);
        list.add(eatPork);
        list.add(doMath);
        list.add(singAwfully);
    }


    public static List<Task> retList(){
        return list;
    }

}
