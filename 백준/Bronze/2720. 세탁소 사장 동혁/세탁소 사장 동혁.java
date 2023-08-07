import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][4];

        for(int i=0; i<N; i++){
            int total = sc.nextInt();
            while(total > 0) {
                if(total-25 >= 0) {
                    total-=25;
                    arr[i][0]++;
                } else if (total-10 >= 0) {
                    total-=10;
                    arr[i][1]++;
                } else if (total-5 >= 0) {
                    total-=5;
                    arr[i][2]++;
                } else {
                    total-=1;
                    arr[i][3]++;
                }
            }
        }
        for(int i=0; i<N; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}