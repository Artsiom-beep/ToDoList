public class analizeSituation {
    public static void analizeSituation (long info) throws MyException{
        System.out.println("Analizing tasks");
        if(info > 5){
            throw new MyException(info);
        }

    }
}
