public class AtoI {
    int atoi(String str)  {
        // ignore whitespaces
        int sign = 1; // positive
        long ans = 0L;
        int i = 0;

        while (str.charAt(i)==' ') {
            i+=1;
        }

        // check for signs
        if (str.charAt(i)=='-' || str.charAt(i)=='+') {
            sign = (str.charAt(i)=='-') ? -1 : 1;
            i+=1;
        }

        // parse integer
        while (Character.isDigit(str.charAt(i))) {
            ans = (ans * 10) + (str.charAt(i) - '0');
            if (ans >= Integer.MAX_VALUE && sign == -1) return Integer.MIN_VALUE;
            if (ans >= Integer.MAX_VALUE && sign == 1) return Integer.MAX_VALUE;
            i+=1;
        }
        // return
        return (int) ans * sign;
    }

    public static void main(String[] args) {
        AtoI atoi = new AtoI();
        String str2 = "   -42321234567890gag";

        int i = atoi.atoi(str2);
        System.out.println(i);
    }
}
