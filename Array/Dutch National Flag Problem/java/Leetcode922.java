// **Sort Array By Parity II**
// > Dutch National Flag Approach (but instead of 3 flags, we have 2 flags: even and odd)
// **Algorithm**
// 1. Initialize two pointers, `even` and `odd`, to 0 and 1 respectively.
// 2. Iterate through the array while both pointers are within bounds.
// 3. If the number at the `even` pointer is even, move the `even` pointer forward by 2.
// 4. If the number at the `odd` pointer is odd, move the `odd` pointer forward by 2.
// 5. If the number at the `even` pointer is odd and the number at the `odd` pointer is even, swap them and move both pointers forward by 2.

class Leetcode922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        while ((even < nums.length) && (odd < nums.length)) {
            if (nums[even] % 2 == 0) even += 2;
            else if (nums[odd] % 2 == 1) odd += 2;
            else {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] result = sortArrayByParityII(nums);
        System.out.print("[");
        for (int num : result) {
            System.out.print(num);
            if (num != result[result.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}