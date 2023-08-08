import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] size = new int[3];

        while(true) {
            for (int i = 0; i < 3; i++)
                size[i] = sc.nextInt();
            Arrays.sort(size);

            if (size[2] == 0 ) break;
            if (size[0] + size[1] > size[2]) {
                if (size[0] == size[2]) System.out.println("Equilateral");
                else if (size[0] == size[1] || size[1] == size[2]) System.out.println("Isosceles");
                else System.out.println("Scalene");
            } else System.out.println("Invalid");
        }
    }
}