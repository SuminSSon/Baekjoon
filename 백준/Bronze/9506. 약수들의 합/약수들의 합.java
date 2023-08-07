import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int sum=0;

            if(n==-1)break;
            for(int i=1; i<n; i++)
                if(n%i == 0) {
                    arr[i] = 1;
                    sum+=i;
                }

            if(n == sum){
                System.out.print(n+" = 1");
                for(int i=2; i<=n; i++) {
                    if(arr[i]==1) System.out.print(" + "+i);
                }
                System.out.println();
            }
            else System.out.println(n+" is NOT perfect.");
        }
    }
}