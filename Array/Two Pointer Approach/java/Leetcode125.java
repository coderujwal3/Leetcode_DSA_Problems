class Leetcode125 {
    static boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;

        StringBuilder concat_string = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                concat_string.append(Character.toLowerCase(c));
            }
        }

        String filtered = concat_string.toString();
        System.out.println(filtered);

        int left = 0, right = filtered.length() - 1;
        while (left <= right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        boolean flag = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(flag);
    }
}