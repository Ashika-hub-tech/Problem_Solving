package ARRAY;

public class Two_sum_ptr {
    public static void main(String[] args) {
        int[] arr = {2, 7, 10, 15};
        int i = 0;
        int j = arr.length - 1;
        int tar = 9;
        while (i < j ) {
            if (arr[i] + arr[j] == tar) {
                System.out.println("Indices:" +arr[i] + "," +arr[j]);
                break;
            }
            else if (arr[i] + arr[j] > tar)
            {
            j--;
            }
            else {
                i++;
            }
        }
    }
}
