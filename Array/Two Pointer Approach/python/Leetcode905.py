# **Sort Array By Parity (Leetcode 905)**
# > Two Pointer Approach (slow & fast pointers)
# - Used 2 pointers (slow & fast) - both are assigned initially with value 0.
# - iterate till `fast` < length of `nums` array.
# - if nums[fast] is even then, swap the values of fast pointer and slow pointer, and increment the slow pointer and fast pointer by 1 step forward.
# - Or, if the nums[fast] is not even (i.e. odd), then just increment fast pointer by 1 step forward.
# - And finally return the original array `(nums)`.


class Solution:
    def sortArrayByParity(self, nums: list[int]) -> list[int]:
        slow = 0
        fast = 0
        while fast < len(nums):
            if nums[fast] % 2 == 0:
                nums[fast],nums[slow] = nums[slow],nums[fast]
                slow += 1
            
            fast += 1
        
        return nums
    

def main():
    res = Solution().sortArrayByParity([3,1,2,4])
    print(res)  # Output: [2,4,3,1]

if __name__ == "__main__":
    main()