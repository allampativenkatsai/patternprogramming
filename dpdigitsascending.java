import java.util.Scanner;

public class dpdigitsascending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < i+1 ; k++){
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
        for (int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < i+1; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < n-i-1 ; k++){
                System.out.print(k+1+" ");
            }
            System.out.println();
        }
    }
}
