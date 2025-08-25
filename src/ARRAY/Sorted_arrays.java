package ARRAY;

public class Sorted_arrays {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
