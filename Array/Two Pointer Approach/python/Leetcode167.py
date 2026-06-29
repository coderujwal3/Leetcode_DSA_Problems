# **Two Sum II - Input array is sorted**
# > Two Pointer Approach
# - assigned left and right pointer (left points at starting index, and right points at last index of array/List)
# - Iterate till left < right
# - calculate sum of both pointer's values and check if the sum meets target ?
# - if the sum is less than target (sum < target) -> then need to shift left pointer 1 step forward. `(why left pointer only, because the array/List is sorted so if sum is less then, we will easily get its bigger value in forward to left pointer)`.
# - or if sum is greater than target (sum > target) then need to shift the right pointer 1 step backward. `(why backward - because the array/List is sorted, so if sum is already greater than sum and we need less value, so we need to add smaller values which is present just backward of right pointer)`.

class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        left = 0
        right = len(numbers)-1

        while left < right:
            sum = numbers[left] + numbers[right]
            if sum == target:
                return [left+1, right+1]
            elif sum < target:
                left += 1
            else:
                right -= 1
        
        return []
        
def main():
    numbers = [2,7,11,15]
    target = 9
    res = Solution().twoSum(numbers, target)
    print(res)


if __name__ == "__main__":
    main()