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

  public String toString1(){
    String out = "";
    for (int i = 0; i < data.length; i++){
      if (data[i] == null) out += "null, ";
      else out += data[i] + ", ";
    }
    out += "\n start: " + start + " end: " + end + " size: " + size + " len: " + data.length;
    return out;
  }

  
  public String toString(){
    String out = "{";
    if (start < end){
      for (int di = start; di <= end; di++){
        out += data[di] + "";
        if (di != end) out += ", ";
      }
    }
    else {
      for (int di = start; di < data.length; di++){
        out += data[di] + ", ";
      }
      for (int di = 0; di <= end; di++){
        out += data[di] + "";
        if (di != end) out += ", ";
      }
    }
    return out + "}";
  }

  public void addFirst(E element){
    if (element == null) throw new NullPointerException();
    if (size == data.length){
      E[] d = (E[]) new Object[data.length * 2 + 1];
      d[0] = element;
      int i = 1;
      if (start < end){
        for (int di = start; di <= end; di++){
          d[i] = data[di];
          i++;
        }
      }
      else {
        for (int di = start; di < data.length; di++){
          d[i] = data[di];
          i++;
        }
        for (int di = 0; di <= end; di++){
          d[i] = data[di];
          i++;
        }
      }
      start = 0;
      end = data.length;
      data = d;
      size++;
    }
    else{
      start--;
      if (start < 0) start = data.length - 1;
      size++;
      data[start] = element;
    }
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException();
    if (size == data.length){
      E[] d = (E[]) new Object[data.length * 2 + 1];
      int i = 0;
      if (start < end){
        for (int di = start; di <= end; di++){
          d[i] = data[di];
          i++;
        }
      }
      else {
        for (int di = start; di < data.length; di++){
          d[i] = data[di];
          i++;
        }
        for (int di = 0; di <= end; di++){
          d[i] = data[di];
          i++;
        }
      }
      start = 0;
      end = data.length;
      data = d;
    }
    else{
      if (size > 0) end++;
      if (end == data.length) end = 0;
    }
    data[end] = element;
    size++;
   }
  public E removeFirst(){
    if (size == 0) throw new NoSuchElementException();
    E out = data[start];
    data[start] = null;
    size--;
    start++;
    if (start == data.length) start = 0;
    return out;
  }
  public E removeLast(){
    if (size == 0) throw new NoSuchElementException();
    E out = data[end];
    data[start] = null;
    size--;
    end--;
    if (end < 0) end = data.length - 1;
    return out;
   }
  public E getFirst(){
    if (size == 0) throw new NoSuchElementException();
    return data[start];
  }
  public E getLast(){
    if (size == 0) throw new NoSuchElementException();
    return data[end];
  }
  public static void main(String[] args){
      MyDeque<Integer> d = new MyDeque<Integer>(4);
      //System.out.println(d);
      for (int i = 1; i < 11; i++){
        d.addLast(i);
      }
      for (int i = 1; i < 11; i++){
        d.addFirst(-i);
      }
      System.out.println(d);
      d.removeFirst();
      System.out.println(d);
      d.removeLast();
      System.out.println(d);
    }
}
