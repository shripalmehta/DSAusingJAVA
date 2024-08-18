import java.util.HashMap;
import java.util.Map;

public class FracToDecimal {
    // fracToDec
    String fracToDec(int num, int den) {
        // if den == 0
        if (den==0) return "Undefined";

        if (num==0) return "0";

        int sign = 1; // positive by default
        if (num<0 ^ den<0) {
            sign = -1;
        }

        num = Math.abs(num);
        den = Math.abs(den);

        int quo = num/den;
        int rem = num%den;
        StringBuilder sb = new StringBuilder();

        if (rem==0) {
            return String.valueOf(quo);
        }

        sb.append(quo);
        sb.append('.');
        int siz = sb.length();

        Map<int[], Integer> map = new HashMap<>();
        while (rem!=0) {
            num = rem;
            num *= 10;
            quo = num/den;
            rem = num%den;

            if (map.containsKey(new int[]{quo, rem})) {             // override hashCode and equals methods
                sb.insert(map.get(new int[]{quo, rem}), "(");
                sb.append(quo);
                sb.append(')');
            }

        }

        return "";
    }

    public static void main(String[] args) {
        FracToDecimal fracToDecimal = new FracToDecimal();
        String dec = fracToDecimal.fracToDec(22, 7);
        System.out.println(dec);

    }
}
