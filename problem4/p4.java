import java.util.Scanner;

public class p4 {
    public static int eval(String expression){
        
      }

      public static int apply(int a, int b, String input){
        if(input.equals("+")){
          return a + b;
        }
        else if(input.equals("-")){
          return b - a;
        }
        else if(input.equals("*")){
          return a * b;
        }
        else if(input.equals("$")){
          return a * b - a - b;
        }
        return -1;
      }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String expression = sc.nextLine();
        sc.close();
        System.out.println(eval(expression));
      }
}
