class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        n = len(nums)
        if k <= 0 or k > n:
            return 0.0

        window_sum = sum(nums[0:k])
        max_avg = window_sum / k

        for i in range(k, n):
            window_sum += nums[i] - nums[i - k]
            max_avg = max(max_avg, window_sum / k)

        return float(max_avg)
        

def main():
    nums = [1,12,-5,-6,50,3]
    obj = Solution()
    print(obj.findMaxAverage(nums, 4))

if __name__ == "__main__":
    main()