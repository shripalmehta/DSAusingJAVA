import java.util.ArrayList;
import java.util.List;

// LC 524
public class LongestWordInDictionary {
    String find(String s, List<String> d) {
        d.sort((a,b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        for (String str : d) {
            if (isSubsequence(s, str)) return str;
        }
        return "";
    }

    boolean isSubsequence(String s1, String s2) {
        int i=0, j=0;
        while (i<s1.length() && j<s2.length()) {
            if (s1.charAt(i)==s2.charAt(j)) j++;
            i++;
        }
        if (j==s2.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LongestWordInDictionary lwd = new LongestWordInDictionary();
        List<String> dictionary = new ArrayList<>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");

        System.out.println(lwd.find("abpcplea",  dictionary));

    }
}
