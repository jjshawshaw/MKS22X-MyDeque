public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 9;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = initialCapacity - 1;
  }
  public int size(){
    return size;
  }
  public String toString(){
    return "";
  }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  //public E removeFirst(){ }
  //public E removeLast(){ }
  //public E getFirst(){ }
  //public E getLast(){ }
}
