import java.util.Scanner;

public class p1 {
    public static int sol(){
        String s = "";
        int count = 0;

        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        s = sc.nextLine();

        sc.close();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'c' || s.charAt(i) == 'l' || s.charAt(i) == 'a' || s.charAt(i) == 's' || s.charAt(i) == 'i' ){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(sol());
    }

}