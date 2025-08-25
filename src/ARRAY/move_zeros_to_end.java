package ARRAY;

import java.util.*;
//BRUTEFORCE

public class move_zeros_to_end {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,2};
        int n=arr.length;
        List<Integer> temp=new ArrayList<>();
        //temp- list for storing the non zero numbers
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp.add(arr[i]);
            }
        }
        //Move the numbers from temp to array(front)
        for(int i=0;i<temp.size();i++)
        {
            arr[i]=temp.get(i);
        }
        //Move zeros at the back
        int nz=temp.size();
        for(int i=nz; i<n;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
