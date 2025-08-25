package Basic;

public class N_Prime_numbers {
    public static void main(String[] args) {
        int n = 13;
        prime(n);
    }
    public static void prime(int n) {
        for (int i = 3; i < n; i++) {
            int temp = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.print(i +",");
            }
        }
    }
}


