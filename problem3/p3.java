import java.util.Scanner;

public class p3 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String sol(){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        String output = "";

        for(int i = 0; i < row; i++){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int b = 2;
            while (true) {
                double lower_a = (double) w * b / x;
                double upper_a = (double) y * b / z;

                
                int a_start = (int) Math.ceil(lower_a) + (lower_a == Math.floor(lower_a) ? 1: 0);
                int a_end = (int) Math.floor(upper_a) - (upper_a == Math.ceil(upper_a) ? 1: 0);

                if (a_start <= a_end) {
                    int denom = gcd(a_start, b);
                    output += a_start / denom + " " + b / denom + "\n";
                    break;
                }
                b++;
            }
        }
        sc.close();
        return output;
    }


    public static void main(String[] args) {
        System.out.println(sol());
    }
}
