public class EncodedPotion {
    void EncodePotion(String potion) {
        // String potion = "ABABCABABCDABABCABABCDDD";
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

        for (i = 1, j = 2; i <= potion.length() && j <= potion.length(); ) {
            sb.append(potion.charAt(i - 1));
            if (potion.substring(0, i).equals(potion.substring(i, j))) {
                sb.append('*');
                i = j + 1;
                j = 2 * i;
            } else {
                i++;
                j += 2;
            }
        }
        sb.append(potion.substring(i - 1));

        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        EncodedPotion encodedPotion = new EncodedPotion();
        String str1 = "ABABCABABCDABABCABABCDDD";
        encodedPotion.EncodePotion(str1);

    }
}
