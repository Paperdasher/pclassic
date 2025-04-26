import java.util.Scanner;
import java.io.File;

public class p4 {
    public static int eval(String expression){
        String[] components = expression.split("");
        int result = Integer.parseInt(components[0]);


        for(int i = 0; i < components.length - 2; i++){
            result += apply(result, Integer.parseInt(components[i + 1]), components[i]);
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
                String answer = sc2.nextLine();
                sc2.close();
                System.out.println(eval(expression) == Integer.parseInt(answer));
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
