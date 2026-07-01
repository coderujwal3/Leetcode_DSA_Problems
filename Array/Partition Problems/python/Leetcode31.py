# **Next Permution (leetcode 31)**
# > Partition algo
# **Algorithm**
# - Find the first decreasing element from the right side of the array.
# - If no such element is found, reverse the array and return.
# - Find the first element from the right side of the array which is greater than the found element.
# - Swap the two elements.
# - Reverse the elements after the index of the first found element.


class Leetcode31 :
    def reverse(self,nums: list, start: int) -> None:
        end = len(nums) - 1

        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

    def nextPermutation(self, nums: list) -> None:
        index = -1
        for i in range(len(nums)-2, -1, -1):
            if nums[i] < nums[i+1]:
                index = i
                break
        
        if index == -1:
            self.reverse(nums, 0)
            return
        
        for i in range(len(nums)-1, index, -1):
            if nums[i] > nums[index]:
                nums[i], nums[index] = nums[index], nums[i]
                break

        self.reverse(nums, index+1)


def main():
    nums = [5,4,7,5,3,2]
    obj = Leetcode31()
    obj.nextPermutation(nums)
    print(nums)

if __name__ == "__main__":
    main()