# **Remove Duplicates from Sorted Array II (Leetcode 80)**
# > Two Pointer Approach (slow & fast pointers)
# - assigned 2 pointers (slow & fast) with the initial value as 2 - (why 2 ?:  slow pointer should point to the index where the next valid element belongs. Because we are allowed up to two duplicates)
# - iterate till the last index of array (using fast pointer)
# - Now, check if the value at `fast pointer` index is not equal to `slow-2` pointer index. If it is *NOT-equal* then overwrite the slow pointer's value with fast pointer's value. and increment slow pointer and fast pointer by 1 step forward.
# - Or, if the both pointer's values are equal then just increment the fast pointer by 1 step forward.
# - At last just return the `slow pointer.

class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        slow = 2
        fast = 2

        while fast < len(nums):
            if nums[fast] != nums[slow-2]:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1

        return slow
    

def main():
    res = Solution().removeDuplicates([0,0,1,1,1,1,2,3,3,4])
    print(res)  # Output: 7

if __name__ == "__main__":
    main()