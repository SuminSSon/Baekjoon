import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] size = new int[3];

        for (int i = 0; i < 3; i++)
            size[i] = sc.nextInt();
        Arrays.sort(size);

        if (size[0] + size[1] > size[2]) System.out.println(size[0] + size[1] + size[2]);
        else System.out.println((size[0] + size[1]) * 2 - 1);
    }
}