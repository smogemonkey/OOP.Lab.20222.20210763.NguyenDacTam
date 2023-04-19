import java.util.Scanner;

public class Ex6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxStars = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            int numStars = 2 * i - 1;
            int numSpaces = (maxStars - numStars) / 2; 
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
