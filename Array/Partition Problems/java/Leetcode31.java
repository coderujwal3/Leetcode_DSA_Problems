// **Next Permution (leetcode 31)**
// > Partition algo
// **Algorithm**
// - Find the first decreasing element from the right side of the array.
// - If no such element is found, reverse the array and return.
// - Find the first element from the right side of the array which is greater than the found element.
// - Swap the two elements.
// - Reverse the elements after the index of the first found element.

class Leetcode31 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0);
            return;
        }

        for (int j = n - 1; j > index; j--) {
            if (nums[j] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        reverse(nums, index + 1);
    }

    static void reverse(int[] nums, int index) {
        for (int i = nums.length - 1; i > index; i--) {
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;

            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 5, 4, 7, 5, 3, 2 };
        nextPermutation(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}