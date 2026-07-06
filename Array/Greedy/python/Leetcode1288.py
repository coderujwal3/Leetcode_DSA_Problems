# **Remove Covered Intervals**
# >> Greedy Algorithm
# **Algorithm:**
# 1. Sort the intervals based on the starting point. If two intervals have the same starting point, sort them based on the ending point in descending order.
# 2. Initialize a variable `end` to keep track of the end of the last added interval.
# 3. Iterate through the sorted intervals:
#    - If the current interval's end is greater than `end`, it means this interval is not covered by the previous intervals, so increment the count and update `end` to the current interval's end.
#    - If the current interval's end is less than or equal to `end`, it means this interval is covered by the previous intervals, so skip it.
# - Return the count of non-covered intervals.


class Solution:
    def removeCoveredIntervals(self, intervals: list[list[int]]) -> int:
        intervals.sort(key=lambda x: (x[0], -x[1]))

        count = 0
        prev_end = float('-inf')
        
        for _, end in intervals:
            if end > prev_end:
                count += 1
                prev_end = end
        
        return count
    
def main():
    solution = Solution()
    intervals = [[1,2],[1,4],[3,4]]
    result = solution.removeCoveredIntervals(intervals)
    print(result)  # Output: 1

if __name__ == "__main__":
    main()