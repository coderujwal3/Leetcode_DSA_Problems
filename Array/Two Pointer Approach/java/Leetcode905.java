// **Sort Array By Parity (Leetcode 905)**
// > Two Pointer Approach (slow & fast pointers)
// - Used 2 pointers (slow & fast) - both are assigned initially with value 0.
// - iterate till `fast` < length of `nums` array.
// - if nums[fast] is even then, swap the values of fast pointer and slow pointer, and increment the slow pointer and fast pointer by 1 step forward.
// - Or, if the nums[fast] is not even (i.e. odd), then just increment fast pointer by 1 step forward.
// - And finally return the original array `(nums)`.

// you guys can create an array (I am not doing this because I don't want to solve this question in O(1) space complexity)
class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 == 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
        System.out.print("Sorted array by parity: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}