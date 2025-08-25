package ARRAY;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class Union_of_arrays {
    public static void main(String[] args) {
        int[] arr1={1,4,6,8};
        int[] arr2={1,3,2,5,7,6};
        Set<Integer> unionSet=new TreeSet<>();
        for(int num:arr1)
        {
            unionSet.add(num);
        }
        for(int num:arr2)
        {
            unionSet.add(num);
        }
        for(int num:unionSet)
        {
            System.out.print(num +",");
        }
    }
}
