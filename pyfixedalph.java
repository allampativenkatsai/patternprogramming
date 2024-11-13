import java.util.Scanner;

public class pyfixedalph {
    public static void main(String[] args) {
        System.out.println("Enter n value:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1 ; i < n ; i++){
            for (int j = 1 ; j < n-i ; j++ ){
                System.out.printf(" ");
            }
            for(int k = 0 ; k < i ; k++){
                System.out.printf((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
