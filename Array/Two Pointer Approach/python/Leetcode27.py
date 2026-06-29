# Two Pointer Approach (slow & fast pointer)
# - Assigned 2 pointers (slow and fast) - both are starting from starting index of array.
# - Iterate till fast pointer reaches last index of array. ```while (fast < nums.length)```
# - In this, check if the value is pointed by fast pointer is not equal to target value ? ```if (fast < nums.length)```- if it is not equal then assign that value to the slow pointer's index place. and increment slow pointer by 1 step forward, and fast pointer by 1 step forward.
# - Or if the fast pointer's indexed value is equal to target value, then just increment right pointer by 1 step forward.
# - At last just return the slow pointer (holding last index of that removed target value array.

class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        slow = 0
        fast = 0

        while fast < len(nums):
            if nums[fast] != val:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1

        return slow
    

def main():
    nums = [3, 2, 2, 3]
    val = 3
    result = Solution().removeElement(nums, val)
    print(result)  # Output: 2
    print(nums[:result])  # Output: [2, 2]

if __name__ == "__main__":
    main()