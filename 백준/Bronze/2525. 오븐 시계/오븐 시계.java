import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        m+=time;
        while(m>=60){
            m-=60;
            if(h==23) h = 0;
            else h++;
        }

        System.out.println(h+" "+m);
    }
}