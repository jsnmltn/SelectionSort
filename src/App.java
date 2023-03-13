
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // generate an array of random integers of size determined by user
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = key.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("\nPlease select one of the following options:");
        System.out.println("1. Sort the array in ascending order");
        System.out.println("2. Sort the array in descending order");
        System.out.println("3. Exit the program");
        System.out.println("Enter your choice: ");
        int choice = key.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The array is: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("\nThe sorted array is:");
                App.ascendingSort(arr);
                break;
            case 2:
                System.out.println("The array is: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("\nThe sorted array is:");
                App.descendingSort(arr);
                break;
            case 3:
                System.out.println("Thank you for using the program!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
            key.close();
    }
    //method to sort the array in ascending order
    public static void ascendingSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //method to sort the array in descending order
    public static void descendingSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    

}
