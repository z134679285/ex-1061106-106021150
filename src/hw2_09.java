import java.util.Scanner;

public class hw2_09 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a);
                a=a+1;
            }
            System.out.println();
        }
    }
}