package ARRAY;

public class FirstGreatest {
    public static void main(String[] args) {
        int[] num={1,2,3,6,9};
        int max=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
        }
        System.out.print(max);
    }
}
