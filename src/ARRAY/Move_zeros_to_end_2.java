package ARRAY;

public class Move_zeros_to_end_2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 2};
        int n = arr.length;
        int j = -1;

        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, no need to proceed
        if (j == -1) {
            for (int num : arr) System.out.print(num + " ");
            return;
        }

        // Swap non-zero elements with zero
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

