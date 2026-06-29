// **Container With Most Water**
// **Two Pointer Approach**
// - left & right both starts from 0th & last index of array
// - iterate till left < right
// - calculate width = right - left
// - calculate current_height = min(height[left], height[right])
// - calculate current_area = width * current_height
// - update max_area = max(max_area, current_area)
// - if height[left] < height[right], then move left pointer 1 step forward
// - else, move right pointer 1 step backward
// - Finally, return max_area

class Leetcode11 {
    static int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;
        // for (int i = 0; i < height.length; i++) {
        //     if (height[left] <= height[right]) {
        //         int area = (right-left) * height[left];
        //         maxArea = Math.max(maxArea, area);
        //         left++;
        //     }
        //     else {
        //         int area = (right-left) * height[right];
        //         maxArea = Math.max(maxArea, area);
        //         right--;    
        //     }
        // }
        while (left < right) {
            int width = right - left;
            int current_height = Math.min(height[left], height[right]);
            int current_area = width * current_height;
            maxArea = Math.max(maxArea, current_area);

            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int result = maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(result);
    }
}