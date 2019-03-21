public class Driver {
  public static void main(String[] args){
    MyDeque<Integer> d = new MyDeque<Integer>(1);
    System.out.println(d);
    d.addFirst(1);
    d.addFirst(1);
    System.out.println(d);
  }
}
