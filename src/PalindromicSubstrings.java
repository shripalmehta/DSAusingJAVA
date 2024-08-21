class PalindromicSubstrings {
    int isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString())? 1:0;
    }
    public int countSubstrings(String s) {
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<s.length(); j++) {
                count += isPalindrome(s.substring(i, j));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstrings ps = new PalindromicSubstrings();
        System.out.println(ps.countSubstrings("abcba"));
    }
}