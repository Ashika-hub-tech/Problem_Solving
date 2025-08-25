/*Brute Force
        int n=137;
        int temp=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                temp++;
                break;
            }
        }
        if(temp==0)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("composite");
        } */

//Function
/*package Basic;
public class Prime_Composite {
    public static void main(String[] args) {
        int n = 137;
        System.out.println(Prime(n));
    }
    public static String Prime(int n) {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
             return ("composite");
        }
        return "Prime";
    }
} */
//Optimal
package Basic;
public class Prime_Composite {
    public static void main(String[] args) {
        int n = 137;
        System.out.println(Prime(n));
    }
    public static String Prime(int n) {
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
                return ("composite");
        }
        return "Prime";
    }
}


