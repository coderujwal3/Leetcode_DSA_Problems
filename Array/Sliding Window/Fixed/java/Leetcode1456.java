// **Maximum Number of Vowels in a Substring of Given Length**
// >> Fixed Sliding Window approach
// **Algorithm**:
// - Initialize a variable `count` to keep track of the number of vowels in the current window of size `k`.
// - Iterate through the first `k` characters of the string and count the number of vowels.
// - Initialize a variable `maxCount` to store the maximum number of vowels found in any window of size `k`.
// - Slide the window across the string from index `k` to the end of the string:
// - For each character at index `i`, check if it is a vowel. If it is, increment the `count`.
// - Check the character that is leaving the window (at index `i - k`). If it is a vowel, decrement the `count`.
// - Update `maxCount` if the current `count` is greater than `maxCount`.
// - Return `maxCount` as the result.


// =============================== 1st approach (without precomputing) ===============================
// class Solution {
//     public int maxVowels(String s, int k) {
//         int maxCount = 0;
//         int currentCount = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (isVowel(s.charAt(i))) {
//                 currentCount++;
//             }
//             if (i >= k) {
//                 if (isVowel(s.charAt(i - k))) {
//                     currentCount--;
//                 }
//             }
//             maxCount = Math.max(maxCount, currentCount);
//         }
//         return maxCount;
//     }
//     private boolean isVowel(char ch) {
//         return "aeiou".indexOf(ch) != -1;
//     }
// }



class Leetcode1456 {
    private static final boolean[] IS_VOWEL = new boolean[128];

    static {
        IS_VOWEL['a'] = true;
        IS_VOWEL['e'] = true;
        IS_VOWEL['i'] = true;
        IS_VOWEL['o'] = true;
        IS_VOWEL['u'] = true;
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        if (k == 0 || n < k) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            if (count > maxCount) {
                maxCount = count;
                if (maxCount == k) {
                    return k;
                }
            }
        }
        return maxCount;
    }

    private boolean isVowel(char c) {
        return c < 128 && IS_VOWEL[c];
    }

    public static void main(String[] args) {
        Leetcode1456 solution = new Leetcode1456();
        String s = "abciiidef";
        int k = 3;
        int result = solution.maxVowels(s, k);
        System.out.println(result);
    }
}