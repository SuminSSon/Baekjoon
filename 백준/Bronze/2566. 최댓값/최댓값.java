import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int row = 0, col = 0, max = 0;

        for(int i=0; i<9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

                if(max < arr[i][j]){
                    row = i;
                    col = j;
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.print((row+1)+" "+(col+1));
    }
}