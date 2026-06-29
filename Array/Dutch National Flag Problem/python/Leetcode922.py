# **Sort Array By Parity II**
# > Dutch National Flag Approach (but instead of 3 flags, we have 2 flags: even and odd)
# **Algorithm**
# 1. Initialize two pointers, `even` and `odd`, to 0 and 1 respectively.
# 2. Iterate through the array while both pointers are within bounds.
# 3. If the number at the `even` pointer is even, move the `even` pointer forward by 2.
# 4. If the number at the `odd` pointer is odd, move the `odd` pointer forward by 2.
# 5. If the number at the `even` pointer is odd and the number at the `odd` pointer is even, swap them and move both pointers forward by 2.

class Solution:
    def sortArrayByParityII(self, nums: list[int]) -> list[int]:
        even, odd = 0,1
        while even < len(nums) and odd < len(nums):
            if nums[even] % 2 == 0:
                even += 2
            elif nums[odd] % 2 == 1:
                odd += 2
            else:
                nums[even], nums[odd] = nums[odd], nums[even]
                even += 2
                odd += 2

        return nums
    
def main():
    nums = [4, 2, 5, 7]
    solution = Solution()
    result = solution.sortArrayByParityII(nums)
    print(result)

if __name__ == "__main__":
    main()