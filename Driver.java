public class Driver {
  public static void main(String[] args){
    MyDeque<Integer> d = new MyDeque<Integer>(4);
    //System.out.println(d);
    for (int i = 1; i < 11; i++){
      d.addLast(i);
    }
    System.out.println(d);
  }
}
