package ARRAY;

public class Remove_Duplicates_S {
    public static int main(String[] args) {
        int[] arr={2,2,3,4,5,1,1};
        int i=0;
        for(int j=1;j< arr.length;j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;

    }
}
