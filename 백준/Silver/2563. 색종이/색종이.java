import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean[][] arr = new boolean[100][100];
        int cnt=0;

        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x; j<x+10; j++)
                for(int k=y; k<y+10; k++)
                    arr[j][k] = true;
        }

        for(int x=0; x<100; x++)
            for(int y=0; y<100; y++)
                if(arr[x][y] == true) cnt ++;

        System.out.println(cnt);
    }
}