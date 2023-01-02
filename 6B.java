import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

       
        int[] arr = new int[n];ay
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index of the element to be retrieved: ");
        int index = sc.nextInt();

        try {
          
            int element = arr[index];
            System.out.println("The element at index " + index + " is " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
          
            System.out.println("Invalid index! The array has only " + n + " elements.");
        }
    }
}
