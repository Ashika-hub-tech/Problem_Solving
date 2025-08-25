package ARRAY;

import java.util.*;

public class Descending_order {
    public static void main(String[] args) {
        Integer[] arr={2,1,5,9,3}; //Non primitive type-Then only we use Collections.reverseOrder()
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
