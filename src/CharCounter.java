// GS Coding Question Bank

import java.lang.*;
import java.util.*;

// imput "AABBBCCCD"
// output "A2B3C3D1

public class CharCounter {
    String countedString(String str) {
        if (str.isEmpty()) {
            return "";
        }

        int i = 1;
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (i = 1; i<str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count += 1;
            } else {
                sb.append(str.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(i-1));
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        CharCounter charCounter = new CharCounter();
        System.out.println(charCounter.countedString("AABBBCCCD"));
        System.out.println(charCounter.countedString("AAAAAA"));
    }
}
