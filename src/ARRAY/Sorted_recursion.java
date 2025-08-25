package ARRAY;

public class Sorted_recursion {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        System.out.println(is_sorted(arr,0)?"True":"False");
    }

    public static boolean is_sorted(int[] arr,int i) {
        if(i==arr.length-1)
            return true;
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        //Recursive call for the next index
        return is_sorted(arr,i+1);
    }
}
