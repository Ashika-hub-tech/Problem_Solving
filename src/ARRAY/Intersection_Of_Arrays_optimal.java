package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_Arrays_optimal {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,8};
        int[] b={1,3,2,5,7,6};
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(a); // Sort first array
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length&& j< b.length)
        {
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
            }
            else if (a[i]<b[j]) {
                i++;
                j++;
            }
            else
                i++;
                j++;
        }
        for(int num:ans)
        {
            System.out.print(num +",");
        }


    }
}
