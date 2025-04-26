import java.util.Scanner;

public class p2 {

    public static int sol(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int rowcount = 0;
        int maxrows = 0;

        outerLoop:
        for(int i = 0; i < row; i++){
            boolean isRowEmpty = true;
            for(int j = 0; j < col; j++){
                int num = sc.nextInt();
                if(num == 2){
                    break outerLoop;
                }
                else if(num == 1){
                    isRowEmpty = false;
                }
            }
            if(isRowEmpty){
                rowcount++;
            }
            else{
                if (rowcount > maxrows){
                    maxrows = rowcount;
                }
                rowcount = 0;
            }
        }

        if (rowcount > maxrows) {
            maxrows = rowcount;
        }
        

        sc.close();
        return maxrows;
    }

    public static void main(String[] args){
        System.out.println(sol());
    }
}
