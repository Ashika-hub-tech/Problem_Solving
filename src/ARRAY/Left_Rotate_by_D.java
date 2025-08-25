package ARRAY;
public class Left_Rotate_by_D {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int D = 3;
        int N = arr.length;
        int[] temp=new int[D];
        D = D % N;
        //Store first D elements in temp arr
        for(int i=0; i<D;i++)
        {
            temp[i]=arr[i];
        }
        //Shifting the rest arr
        for(int i=D;i<N;i++)
        {
            arr[i-D]=arr[i];
        }
        //pullback temp to end of arr
        for(int i=0;i<D;i++)
        {
           arr[i+2]= temp[i];
        }
        /*
        for(int i=0;i<D;i++)
        {
           arr[N-D+i]= temp[i];
        }
        /*
         */
        System.out.println("The array after" + D +"rotaions:");
        for(int i=0; i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
