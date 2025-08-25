package STRING;

import java.util.Scanner;

public class Palindrome {
    public static boolean is_palindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(is_palindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
