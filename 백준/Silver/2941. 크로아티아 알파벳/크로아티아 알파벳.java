import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String val:arr){
            s = s.replace(val, "A");
        }
        System.out.println(s.length());
    }
}