public class MyException extends Exception {

  long a;
  public MyException(long a){
    this.a = a;
  }

  public long retA(){
    return a;
  }


}
