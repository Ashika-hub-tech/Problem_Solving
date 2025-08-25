package ARRAY;
public class Move_Zeroes_New {
    public static void main(String[] args) {
        int j = 0; // Pointer for placing non-zero numbers
        int[] nums = {2, 0, 3, 4, 5, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; //If nums[i] ==0, it will not come into the loop & j will not incremented
            }
        }
            for(int k:nums){
                System.out.print(k+" ");
            }
        }
    }



