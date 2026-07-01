class Solution:
    def pivotArray(self, nums: list[int], pivot: int) -> list[int]:
        less = []
        equal = []
        greater = []
        
        for num in nums:
            if num < pivot:
                less.append(num)
            elif num == pivot:
                equal.append(num)
            else:
                greater.append(num)
        
        return less + equal + greater
    
def main():
    solution = Solution()
    nums = [9, 12, 5, 10, 14, 3, 10]
    pivot = 10
    result = solution.pivotArray(nums, pivot)
    print(result)


if __name__=="__main__":
    main()