class Solution:
    def maxArea(self, height: list[int]) -> int:
        """
        **Container With Most Water**
        **Two Pointer Approach**
        - left & right both starts from 0th & last index of array
        - iterate till left < right
        - calculate width = right - left
        - calculate current_height = min(height[left], height[right])
        - calculate current_area = width * current_height
        - update max_area = max(max_area, current_area)
        - if height[left] < height[right], then move left pointer 1 step forward
        - else, move right pointer 1 step backward
        - Finally, return max_area
        """

        
        left = 0
        right = len(height) - 1
        max_area = 0
        
        while left < right:
            width = right - left
            current_height = min(height[left], height[right])
            current_area = width * current_height
            max_area = max(max_area, current_area)
            
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return max_area
    

def main():
    height = [1,8,6,2,5,4,8,3,7]
    solution = Solution()
    result = solution.maxArea(height)
    print(result)

if __name__ == "__main__":
    main()