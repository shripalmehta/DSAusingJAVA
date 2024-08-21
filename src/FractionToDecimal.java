import java.util.HashMap;
import java.util.Map;

// LC 166
public class FractionToDecimal {
    String convert(int numerator, int denominator) {

        // Check for den==0
        if (denominator==0) return "Undefined";

        // Check for num==0
        if (numerator==0) return "0";

        // Check for num%den==0
        if (numerator%denominator==0) return String.valueOf((long) numerator/(long) denominator);

        // Check for num%den!=0
        StringBuilder res = new StringBuilder();
        // Check for sign
        int sign = ((numerator<0) ^ (denominator<0)) ? -1 : 1;
        if (sign<0) res.append("-");

        Long num = Math.abs((long) numerator);
        Long den = Math.abs((long) denominator);

        Long quo = num/den;
        Long rem = num%den;

        res.append(quo);
        res.append('.');

        Map<Long, Integer> map = new HashMap<>();
        while (rem!=0) {
            if (map.containsKey(rem)) {
                res.insert(map.get(rem), "(");
                res.append(")");
                break;
            }
            map.put(rem, res.length());
            rem = rem*10;
            quo = rem/den;
            rem = rem%den;
            res.append(quo);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        FractionToDecimal fractionToDecimal = new FractionToDecimal();
        System.out.println(fractionToDecimal.convert(-1, -2147483648));
    }
}
