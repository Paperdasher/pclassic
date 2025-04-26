import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class p4 {
    public static int eval(String expression){
        String[] components = expression.split("");
        int result = Integer.parseInt(components[0]);


        for(int i = 1; i < components.length - 1; i += 2){
            result = apply(result, Integer.parseInt(components[i + 1]), components[i]);
        }
        return result;
      }

      public static int apply(int a, int b, String input){
        if(input.equals("+")){
          return a + b;
        }
        else if(input.equals("-")){
          return a - b;
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
                File file = new File("input" + args[0] + ".txt");
                Scanner sc = new Scanner(file);
                sc.nextLine();
                String expression = sc.nextLine();
                sc.close();

                File ans = new File("output" + args[0] + ".txt");
                Scanner sc2 = new Scanner(ans);
                int answer = sc2.nextInt();
                sc2.close();
                boolean calc = eval(expression) == answer;
                System.out.println("" + calc + ": " + eval(expression));
            }catch(FileNotFoundException e){
                System.out.println("File not found or error reading file: " + e.getMessage());
                e.printStackTrace();
                return;
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
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
