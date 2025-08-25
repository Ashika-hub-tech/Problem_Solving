package ARRAY;

public class LowestNumber {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7};
        int Min=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]<Min)
                Min = arr[i];
        }
        System.out.println(Min);
    }
}
