public class MissingAlpha {
    String missingAlpha(String str) {
        int[] chars = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                chars[Character.toLowerCase(ch) - 'a']++;
            }
        }

        for (int i=0; i<26; i++) {
            if (chars[i]==0) {
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str3 = "The quick brown fox jumps over the dogs";
        MissingAlpha ma = new MissingAlpha();
        System.out.println(ma.missingAlpha(str3));
    }
}
