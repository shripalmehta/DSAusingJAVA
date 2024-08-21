import java.lang.*;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class PhoneCombinations {
    String[] keyMapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void comboRecursive(String digits, String asf, List<String> ans) {
        if (digits.isEmpty()) {
            ans.add(asf);
            return;
        }
        char firstDigit = digits.charAt(0);
        String digitLeft = digits.substring(1);
        String key = keyMapping[Integer.parseInt("" + firstDigit)];
        for (char ch : key.toCharArray()) {
            comboRecursive(digitLeft, asf + ch, ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans;
        comboRecursive(digits, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        PhoneCombinations pc = new PhoneCombinations();
        List<String> ans = pc.letterCombinations("23");
        for (String str : ans) {
            System.out.print(str + " ");
        }
    }
}


