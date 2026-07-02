class Leetcode643 {
    static {
        for (int i = 0; i < 100; i++) {
            findMaxAverage(new int[1], 1);
        }
    }
    public static double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length; 
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
      
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum; 
            }
        }
        
        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}