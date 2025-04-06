package Problems;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target Element: ");
        int k = sc.nextInt();
        int[] result = findTwoSum(arr, k);
        if (result[0] == -1) {
            System.out.println("Pair not found.");
        } else {
            System.out.println("Pair found at indices: " + result[0] + ", " + result[1]);
        }
    }
    public static int[] findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
