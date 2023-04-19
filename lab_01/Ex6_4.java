import java.util.Scanner;

public class Ex6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        boolean validInput;

        do {
            validInput = true;

            System.out.print("Enter a month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter a year: ");
            year = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                validInput = false;
            }

            if (year < 1) {
                System.out.println("Invalid year. Please enter a positive integer .");
                validInput = false;
            }
        } 
        while (!validInput);

        int daysInMonth = getDaysInMonth(month, year);
        System.out.println("There are " + daysInMonth + " days in month " + month + " of year " + year + ".");
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}