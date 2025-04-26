import java.util.Scanner;
import java.io.File;
import java.util.ArrayDeque;

public class p4 {
    public static int eval(String expression){
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] components = expression.split("");
        for(int i = 0; i < components.length; i++){
            try{
              stack.add(Integer.parseInt(components[i]));
            }catch(NumberFormatException e){          
              stack.add(apply(stack.removeLast(), Integer.parseInt(components[i+1]), components[i]));
            }
          }
        return -1;
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
        if(args.length > 0){
            try{
                File file = new File(args[0]);
                Scanner sc = new Scanner(file);
                sc.nextLine();
                String expression = sc.nextLine();
                sc.close();
                System.out.println(eval(expression));
            }catch(Exception e){
                System.out.println("File not found or error reading file.");
                return;
            }

        } else{
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            String expression = sc.nextLine();
            sc.close();
            System.out.println(eval(expression));
        }
      }
}
