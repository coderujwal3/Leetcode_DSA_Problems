# **Reverse String**
# > Two Pointer Approach
# - assigned left and right pointer (left points at starting index, and right points at last index of array/List)
# - Iterate till left < right:
# - swap the values of both pointer's values and then shift left pointer 1 step forward and right pointer 1 step backward.

class Solution:
    def reverseString(self, s: list[str]) -> None:
        left = 0
        right = len(s)-1

        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1

def main():
    s = ["h","e","l","l","o"]
    Solution().reverseString(s)
    print(s)

if __name__ == "__main__":
    main()