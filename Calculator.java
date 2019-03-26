import java.util.*;
public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      MyDeque<Double> nums = new MyDeque<Double>();
      MyDeque<String> ops = new MyDeque<String>();
      tokenize(s, nums, ops);
      System.out.println(nums);
      System.out.println(ops);
      return 0;
    }

    public static void tokenize(String s, MyDeque<Double> nums, MyDeque<String> ops){
      String[] split = s.split(" ");
      for (String val : split){
        try {
          int i = Double.parseInt(val);
          nums.addLast(i);
        }
        catch(Exception e){
          ops.addLast(val);
        }
      }
    }

    public static void main(String[] args){
      Calculator("1 2 3 4 5 + * - -");
    }
  }
