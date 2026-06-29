class Leetcode75:
    def sortColors(self,nums:list) -> None:
        """
        **Sort Colors**
        **Dutch National Flag Problem**
        - Given an array `nums` with `n` objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
        - We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.
        - You must solve this problem without using the library's sort function.

        **Algor**
        - Initialize three pointers: `left`, `mid`, and `right`.
        - `left` will point to the next position for `0`, `mid` will traverse the array, and `right` will point to the next position for `2`.
        - Iterate through the array with `mid`:
            - If `nums[mid]` is `0`, swap it with `nums[left]`, increment both `left` and `mid`.
            - If `nums[mid]` is `1`, just increment `mid`.
            - If `nums[mid]` is `2`, swap it with `nums[right]` and decrement `right`. Do not increment `mid` in this case, as the swapped value needs to be checked.
        **Time Complexity**: O(n), where n is the number of elements in the array. Each element is processed at most once.
        **Space Complexity**: O(1), as we are using constant extra space.
        """
        
        left,right,mid = 0, len(nums)-1, 0
        while mid <= right:
            if nums[mid] == 0:
                nums[mid],nums[left] = nums[left],nums[mid]
                left += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid],nums[right] = nums[right],nums[mid]
                right -= 1



def main():
    nums = [2,0,2,1,1,0]
    obj = Leetcode75()
    obj.sortColors(nums)
    print(nums)

if __name__ == "__main__":
    main()