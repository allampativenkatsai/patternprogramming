import java.util.Scanner;

public class Alpharight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n value ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char c =(char) (64+n-i);
            for (int j = 0; j < i + 1; j++) {

                System.out.printf(c+ " ");
                c =(char) (64+n-i+1+j);
            }
            System.out.println();
        }
    }
}
