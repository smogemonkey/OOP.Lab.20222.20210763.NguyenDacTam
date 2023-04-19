import java.util.Scanner;

public class Ex2_2_6 {
    public static void solveLinearEquation() {
        /*
         * solve ax + b = 0
         * read a and b from user keyboard
         */
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("infinitely solutions.");
            } else {
                System.out.println("no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("solution is x = " + x);
        }
        scanner.close();
    }
    public static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);

        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();

        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            if (c1 == c2) {
                System.out.println("infinitely solutions.");
            } else {
                System.out.println("no solution.");
            }
        } else {
            double x = (b2 * c1 - b1 * c2) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("solution is x = " + x + ", y = " + y);
        }
        scanner.close();
    }
    public static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("solutions are x = " + x1 + " and x = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("solution is x = " + x);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("solutions are x = " + realPart + " + " + imaginaryPart + "i and x = " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        solveSecondDegreeEquation();
        /*
         * choose a solver
         */
    }
}

