import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void highest(int arr[]) {
        Arrays.sort(arr); // Sort the array
        int count = 0;
        int previous = 0;
        int hon = 0;

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            while (i < arr.length && arr[i] == j) {
                count++;
                i++;
            }
            if (count > previous) {
                previous = count;
                hon = arr[--i];
            } else {
                --i;
            }
            count = 0;
        }
        System.out.println("The highest number of occurring number is: " + hon);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int arr[] = new int[n]; // Initialize array with the correct size
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        highest(arr);
    }
}

