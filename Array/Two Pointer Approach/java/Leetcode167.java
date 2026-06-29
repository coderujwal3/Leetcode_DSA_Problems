// **Two Sum II - Input array is sorted**
// > Two Pointer Approach
// - assigned left and right pointer (left points at starting index, and right points at last index of array/List)
// - Iterate till left < right
// - calculate sum of both pointer's values and check if the sum meets target ?
// - if the sum is less than target (sum < target) -> then need to shift left pointer 1 step forward. `(why left pointer only, because the array/List is sorted so if sum is less then, we will easily get its bigger value in forward to left pointer)`.
// - or if sum is greater than target (sum > target) then need to shift the riight pointer 1 step backward. `(why backward - because the array/List is sorted, so if sum is already greater than sum and we need less value, so we need to add smaller values which is present just backward of right pointer)`.

class Leetcode167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println("["+res[0] + ", " + res[1]+"]");
    }
}