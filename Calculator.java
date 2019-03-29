import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      System.out.println(s);
      String[] split = s.split(" ");
      MyDeque<Double> vals = new MyDeque<Double>();
      for(String nextval : split){
        if (nextval.equals("+")) {
          vals.addLast(vals.removeLast() + vals.removeLast());
        } else if (nextval.equals("-")) {
          vals.addLast(- vals.removeLast() + vals.removeLast());
        } else if (nextval.equals("*")) {
          vals.addLast(vals.removeLast() * vals.removeLast());
        } else if (nextval.equals("/")) {
          vals.addLast(1 / vals.removeLast() * vals.removeLast());
        } else if (nextval.equals("%")) {
          vals.addLast(vals.removeLast() % vals.removeLast());
        } else {
          vals.addLast(Double.parseDouble(nextval));
        }
      }
      return vals.getLast();
    }


    public static void main(String[] args){
      System.out.println(eval("1 2 3 4 5 + * - -"));
    }
  }
