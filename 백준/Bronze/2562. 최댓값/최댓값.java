import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int max = 0;
        for(int i=0;i<9;i++) {
            int num = sc.nextInt();
            if(max<num){
                cnt = i+1;
                max = num;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}