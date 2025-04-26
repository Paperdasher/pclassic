import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p1 {
    public static int sol(String filename){
        String s = "";
        int count = 0;
        try{
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            sc.nextLine();
            s = sc.nextLine();

            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + filename);
            return -1;
        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
            return -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'c' || s.charAt(i) == 'a' || s.charAt(i) == 's' || s.charAt(i) == 'i' || s.charAt(i) == 'l'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        if(args.length > 0){
            if(args[0].equals("1")){
                boolean result = sol("input1.txt") == 3;
                System.out.println("File 1: " + result);
            }
            if(args[0].equals("2")){
            boolean result = sol("input2.txt") == 11;
                System.out.println("File 2: " + result);
            }
        }
    }

}