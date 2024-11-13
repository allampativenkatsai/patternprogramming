import java.util.Scanner;

public class pyfixeddigit {
    public static void main(String[] args) {
        System.out.println("Enter n value:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
