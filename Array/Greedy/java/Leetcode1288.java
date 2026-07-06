// **Remove Covered Intervals**
// >> Greedy Algorithm
// **Algorithm:**
// 1. Sort the intervals based on the starting point. If two intervals have the same starting point, sort them based on the ending point in descending order.
// 2. Initialize a variable `end` to keep track of the end of the last added interval.
// 3. Iterate through the sorted intervals:
//    - If the current interval's end is greater than `end`, it means this interval is not covered by the previous intervals, so increment the count and update `end` to the current interval's end.
//    - If the current interval's end is less than or equal to `end`, it means this interval is covered by the previous intervals, so skip it.
// - Return the count of non-covered intervals.


import java.util.Arrays;

class Leetcode1288 {
    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        int count = 0;
        int end = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[1] > end) {
                count++;
                end = interval[1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {1, 4}, {3, 4}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}