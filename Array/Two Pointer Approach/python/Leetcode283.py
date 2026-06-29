class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        **Move Zeroes**
        **Two Pointer Approach**

        - left & right both starts from 0th index of array
        - iterate till right <= array's length -1
        - if array[right] != 0, then swap it with left, and move both pointers (left & right) 1 step forward.
        - or else (if array[right] == 0), then just increment right pointer 1 step forward.
        """
        left, right = 0, 0
        while right < len(nums):
            if nums[right] != 0:
                nums[left], nums[right] = nums[right], nums[left]
                left += 1
            right += 1


def main():
    nums = [0, 1, 0, 3, 12]
    solution = Solution()
    solution.moveZeroes(nums)
    print(nums)


if __name__ == "__main__":
    main()