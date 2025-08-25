package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_Arrays {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,8};
        int[] b={1,3,2,5,7,6};
        Arrays.sort(a); // Sort first array
        Arrays.sort(b); // Sort second array
        int n1=a.length;
        int n2=b.length;
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        for(i=0;i<n1;i++) {
            for (j = 0; j<n2; j++) {
                if (a[i] == b[j]) {
                    ans.add(a[i]);
                    break;
                }
                else if (b[j] > a[i])
                    break;
            }
        }
            for(int num:ans)
            {
                System.out.print(num +",");
            }
    }
}
