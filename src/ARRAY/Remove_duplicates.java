package ARRAY;

import java.util.Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,1,1};
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j< arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++)
        {
            System.out.print(arr[k] +" ");
        }
    }

}

