class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        """
            **Remove Duplicates from Sorted Array**
            > Remove Duplicates
            >> Algorithm
            - Use two pointers, one slow and one fast. The slow pointer will track the position of the last unique element, while the fast pointer will iterate through the array to find unique elements.
            - Initialize the slow pointer to 0 and the fast pointer to 1.
            - Iterate through the array with the fast pointer. If the element at the fast pointer is different from the element at the slow pointer, increment the slow pointer and update the element at the slow pointer to be the element at the fast pointer.
            - Continue this process until the fast pointer reaches the end of the array.
            - The length of the array after removing duplicates will be slow + 1, as the slow pointer will be at the index of the last unique element.
        """

        slow = 0
        fast = 1

        if not nums:
            return 0
        
        while fast < len(nums):
            if nums[slow] != nums[fast]:
                slow += 1
                nums[slow] = nums[fast]
            fast += 1

        return slow + 1

def main():
    lst = [0,0,1,1,1,2,2,3,3,4]
    res = Solution().removeDuplicates(lst)
    print(res)

if __name__ == "__main__":
    main()