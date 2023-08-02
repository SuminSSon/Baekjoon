import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int[] arr = new int[max];
        int n = sc.nextInt();

        for(int i=0; i<max; i++) arr[i] = i+1;

        for(int i=0; i<n; i++){
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;

            int k;
            if(end != start) {
                int[] rvs = new int[end - start+1];
                k = 0;
                for (int j = end; j > start - 1; j--) {
                    rvs[k] = arr[j];
                    k++;
                }

                k = 0;
                for (int j = start; j < end + 1; j++) {
                    arr[j] = rvs[k];
                    k++;
                }
            }
        }

        for(int index: arr) System.out.printf(index+" ");
    }
}