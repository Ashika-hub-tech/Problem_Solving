package ARRAY;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int num = 6;
        int index = linear_search(arr, num);
        System.out.println("Returned Index:" + index);
    }


        public static int linear_search(int arr[], int num){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num)
                    return i;
            }
            return -1;
        }
}