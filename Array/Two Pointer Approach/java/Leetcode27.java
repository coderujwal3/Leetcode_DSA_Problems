// Two Pointer Approach (slow & fast pointer)
// - Assigned 2 pointers (slow and fast) - both are starting from starting index of array.
// - Iterate till fast pointer reaches last index of array. ```while (fast < nums.length)```
// - In this, check if the value is pointed by fast pointer is not equal to target value ? ```if (fast < nums.length)```- if it is not equal then assign that value to the slow pointer's index place. and increment slow pointer by 1 step forward, and fast pointer by 1 step forward.
// - Or if the fast pointer's indexed value is equal to target value, then just increment right pointer by 1 step forward.
// - At last just return the slow pointer (holding last index of that removed target value array.

class Leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}