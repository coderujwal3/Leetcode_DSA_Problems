// **Remove Duplicates from Sorted Array**
// > Remove Duplicates
// >> Algorithm
// - Use two pointers, one slow and one fast. The slow pointer will track the position of the last unique element, while the fast pointer will iterate through the array to find unique elements.
// - Initialize the slow pointer to 0 and the fast pointer to 1.
// - Iterate through the array with the fast pointer. If the element at the fast pointer is different from the element at the slow pointer, increment the slow pointer and update the element at the slow pointer to be the element at the fast pointer.
// - Continue this process until the fast pointer reaches the end of the array.
// - The length of the array after removing duplicates will be slow + 1, as the slow pointer will be at the index of the last unique element.


class Leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        if (nums.length == 0) return 0;

        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                fast++;
            }
            else {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + len);
        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
            if (i < len - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}