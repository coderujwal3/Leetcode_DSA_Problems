# **Maximum Number of Vowels in a Substring of Given Length**
# >> Fixed Sliding Window approach
# **Algorithm**:
# - Initialize a variable `count` to keep track of the number of vowels in the current window of size `k`.
# - Iterate through the first `k` characters of the string and count the number of vowels.
# - Initialize a variable `maxCount` to store the maximum number of vowels found in any window of size `k`.
# - Slide the window across the string from index `k` to the end of the string:
# - For each character at index `i`, check if it is a vowel. If it is, increment the `count`.
# - Check the character that is leaving the window (at index `i - k`). If it is a vowel, decrement the `count`.
# - Update `maxCount` if the current `count` is greater than `maxCount`.
# - Return `maxCount` as the result.

class Leetcode1456:
    VOWELS = set("aeiou")

    def maxVowels(self, s: str, k: int) -> int:
        n = len(s)
        if k == 0 or n < k:
            return 0

        count = sum(1 for ch in s[:k] if ch in self.VOWELS)
        max_count = count

        for i in range(k, n):
            if s[i] in self.VOWELS:
                count += 1
            if s[i - k] in self.VOWELS:
                count -= 1
            if count > max_count:
                max_count = count
                if max_count == k:
                    return k

        return max_count


if __name__ == "__main__":
    solution = Leetcode1456()
    s = "abciiidef"
    k = 3
    result = solution.maxVowels(s, k)
    print(result)
