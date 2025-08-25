package ARRAY;

public class Sec_Lowest {
    public static void main (String[] args) {
        // code here
        int[] arr={34,3,5,32};
        int low=arr[0];
        int slow=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<low){
                slow=low;
                low=arr[i];
            }
            else if(arr[i]>low && arr[i]<slow)
            {
                slow=arr[i];
            }

        }
        if (slow == Integer.MAX_VALUE) {
            System.out.println("No second lowest element found.");
        }
        else{
            System.out.println(slow);
        }
    }
}
