package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_of_arrays_optimal {
    public static void main(String[] args) {
        int[] a={1,4,6,8};
        int[] b={1,3,2,5,7,6};
        Arrays.sort(a); // Sort first array
        Arrays.sort(b); // Sort second array
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        List<Integer> unionarr = new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j]) {
                if (unionarr.isEmpty() || unionarr.get(unionarr.size() - 1) != a[i]) {
                    unionarr.add(a[i]);
                }
                i++;
            }
            else{
                    if(unionarr.isEmpty()||unionarr.get(unionarr.size()-1)!=b[j]){
                        unionarr.add(b[j]);
                    }
                    j++;
                }
            }
        while(i<n1) {
            if (unionarr.isEmpty() || unionarr.get(unionarr.size() - 1) != a[i]) {
                unionarr.add(a[i]);
            }
            i++;
        }
        while(j<n2) {
            if (unionarr.isEmpty() || unionarr.get(unionarr.size() - 1) != b[j]) {
                unionarr.add(b[j]);
            }
            j++;
        }

        for(int num:unionarr){
            System.out.print(num + ",");
        }
    }
}
