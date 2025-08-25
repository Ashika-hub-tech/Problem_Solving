package ARRAY;
public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5,5};
        int lar = arr[0];
        int sec_lar = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                sec_lar = lar;
                lar = arr[i];
            }
            else if (arr[i] < lar && arr[i] > sec_lar) {
                sec_lar=arr[i];
            }
        }
        System.out.println(sec_lar);
    }
}
