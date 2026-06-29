class Solution:
    def isPalindrome(self, s: str) -> bool:
        """
        **Valid Palindrome**
        **Two Pointer Approach**
        - left & right both starts from 0th & last index of string
        - iterate till left <= right
        - if string[left] != string[right], then return False
        - else, move both pointers (left & right) 1 step forward & backward respectively
        - Finally, return True
        """

        
        st = ""
        for i in s:
            if not i.isalnum():
                continue
            st += i.lower()
            
        left, right = 0, len(st) - 1
        s = st
        while left <= right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True

def main():
    s = "A man, a plan, a canal: Panama"
    solution = Solution()
    result = solution.isPalindrome(s)
    print(result)


if __name__ == "__main__":
    main()