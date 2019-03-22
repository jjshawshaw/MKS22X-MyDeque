import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 0;
    size = 0;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String out = "";
    for (int i = 0; i < data.length; i++){
      if (data[i] == null) out += "null, ";
      else out += data[i] + ", ";
    }
    out += "\n start: " + start + " end: " + end;
    return out;
  }
  public void addFirst(E element){
    if (start == size){
      E[] d = (E[]) new Object[data.length * 2];
      int i = 0;
      for (int di = start; di < data.length && di < end; di++){
        d[i] = data[di];
        i++;
      }
      for (int di = 0; di < end && di < start; di++){
        d[i] = data[di];
        i++;
      }
    }
  }
  public void addLast(E element){
    if (size > 0) end++;
    System.out.println(this);
    System.out.println("adding " + element);
    if (size == data.length){
      System.out.println("resizing: " + data.length + " to " + data.length * 2);
      E[] d = (E[]) new Object[data.length * 2];
      int i = 0;
      for (int di = start; di < data.length && di <= end; di++){
        System.out.println("di: " + di + " i: " + i + " num: " + data[di]
        + "start: " + start + " end: " + end + " len: " + data.length);
        d[i] = data[di];
        i++;
      }
      for (int di = 0; di <= end && di < start; di++){
        System.out.println(data[di]);
        d[i] = data[di];
        i++;
      }
      start = 0;
      end = data.length;
      data = d;
    }
    data[end] = element;
    if (end == data.length) end = 0;
    size++;
   }
  //public E removeFirst(){ }
  //public E removeLast(){ }
  //public E getFirst(){ }
  //public E getLast(){ }
  public static void main(String[] args){
    MyDeque<Integer> d = new MyDeque<Integer>(4);
    //System.out.println(d);
    for (int i = 1; i < 11; i++){
      d.addLast(i);
    }
    System.out.println(d);
  }
}
