// **Move Zeroes**
// **Two Pointer Approach**

// - left & right both starts from 0th index of array
// - iterate till right <= array's length -1
// - if array[right] != 0, then swap it with left, and move both pointers (left & right) 1 step forward.
// - or else (if array[right] == 0), then just increment right pointer 1 step forward.


import java.io.*;

class Leetcode283 {
    static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        int iteration = 0;
        while (right <= (nums.length-1)) {
            System.out.println("********* Iteration: "+(iteration+1)+" *********");
            if (nums[right] != 0) {
                System.out.println("> Before swapping\n\t left: "+left+"\t"+"right: "+right);
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
                right++;
                System.out.println("> After swapping\n\t left: "+left+"\t"+"right: "+right);
                // System.out.println("\n========- "+nums+" ========-")
            }
            else {
                System.out.println("> else case - Before incrementing\n\t left: "+left+"\t"+"right: "+right);
                right++;
                System.out.println("> else case - After incrementing\n\t left: "+left+"\t"+"right: "+right);
            }
            System.out.print("\n======== After 1 Iteration the array: ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            iteration++;
            System.out.print(" ========\n");
        }

        System.out.println("\n\nFinal Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,4,1,0,8};
        moveZeroes(nums);
    }
}