import java.util.Stack;

public class RemoveDupes {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        int i = 0;
        char[] sChar = s.toCharArray();
        int cnt = 0;
        for ( ; i<sChar.length; i++) {
            if (!stack.isEmpty() && stack.peek()==sChar[i]) {
                count.push(count.peek()+1);
            } else {
                count.push(1);
            }

            stack.push(sChar[i]);

            if (count.peek()==k) {
                for (int j=0; j<k; j++) {
                    stack.pop();
                    count.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int len = stack.size();
        for (i=0; i<len; i++) {
            sb.append(stack.pop());
        }
        return (sb.reverse().toString());
    }

    public static void main(String[] args) {
        RemoveDupes rd = new RemoveDupes();
        System.out.println(rd.removeDuplicates("abcd", 2));
    }
}