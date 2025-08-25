package Basic;

public class Factorial {
    public long factorial(int n){
        long fact=1;
        if(n==0 || n==1)
            return 1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial f=new Factorial();
        int n=7;
        System.out.println("Factorial of" +n +"is: " +f.factorial(n));
    }
}
