// **Reverse String**
// **Two Pointer Approach**
// - left & right pointer (left pointer starts from index 0 and right pointer will start from last index of array)
// - iterating till left <= right pointer
// - just swap each pair at left pointer & right pointer indices
// - and increment left pointer by step 1, and decrement right pointer by 1 step

class Leetcode344 {
    static void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while(left <= right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right --;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.print("[");
        for (char ch: s) {
            if (ch != s[s.length-1]) {
                System.out.print(ch + ", ");
            } else {
                System.out.print(ch);
            }
        }
        System.out.print("]");
    }
}