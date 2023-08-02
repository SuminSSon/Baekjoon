import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double[] arr = new double[num];
        double sum=0.0;

        for(int i=0; i<num; i++) arr[i] = sc.nextDouble();
        Arrays.sort(arr);
        for(int i=0; i<num; i++) sum += arr[i] = arr[i]/arr[num-1]*100;
        System.out.println(sum/num);
    }
}