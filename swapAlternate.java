import java.util.Scanner;

public class swapAlternate {
    public static void Alternate(int arr[]) {
        int n = arr.length;
        int i = 0;
        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                break;
            } else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the number of elements in an array");
            int n = sc.nextInt();
            int arr1[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            }
            Alternate(arr1);

        }
    }
}