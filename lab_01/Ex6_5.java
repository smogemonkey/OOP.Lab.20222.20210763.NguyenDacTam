import java.util.Arrays;
import java.util.Scanner;

public class Ex6_5{
    public static void getSortedArraySumAvg(int[] array) {
        Arrays.sort(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double avg = (double) sum / array.length;

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        getSortedArraySumAvg(array);

        scanner.close();
    }
} 
