import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 10;
    size = 0;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = initialCapacity - 1;
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
      for (int di = start; di < data.length && di <= end; di++){
        d[i] = data[di];
        i++;
      }
      for (int di = 0; di <= end && di < start; di++){
        d[i] = data[di];
        i++;
      }
    }
  }
  public void addLast(E element){
    if (start == size){
      E[] d = (E[]) new Object[data.length * 2];
      int i = 0;
      for (int di = start; di < data.length && di <= end; di++){
        d[i] = data[di];
        i++;
      }
      for (int di = 0; di <= end && di < start; di++){
        d[i] = data[di];
        i++;
      }
    }
   }
  //public E removeFirst(){ }
  //public E removeLast(){ }
  //public E getFirst(){ }
  //public E getLast(){ }
}
