package ARRAY;

public class Third_Largest_Element {
    public static void main(String[] args) {
        int[] arr={45,25,35,15};
        //We can use Integer.MIN_VALUE  here
        int first=-1;
        int second=-2;
        int third=-3;
        for(int num:arr){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(num>second && num!= first){
                third=second;
                second=num;
            }
            else if(num>third && num!=first && num!=third){
                third=num;
            }
        }
        if(third==-3){
            System.out.println("Array doesn't have 3 distinct elements");
        }
        else {
            System.out.println("Third Greatest element: " +third);
        }
    }
}
