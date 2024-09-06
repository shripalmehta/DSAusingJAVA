public class EncodedPotion {
    String EncodePotion(String potion) {
        // String potion = "ABABCABABCDABABCABABCDDD";
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();


        for (; i<potion.length() && j<potion.length(); ) {
            sb.append(potion.charAt(i));
            i+=1;
            j+=2;

            while (i<potion.length() && j<potion.length() && potion.substring(0, i).equals(potion.substring(i, j))) {
                sb.append('*');
                i=j;
                j=2*i;
            }
        }
        sb.append(potion.substring(i));

        return sb.toString();
    }


    public static void main(String[] args) {
        EncodedPotion encodedPotion = new EncodedPotion();
        String str1 = "ABABCABABCDABABCABABCDDD";
        System.out.println(encodedPotion.EncodePotion(str1));
        String str2 = "QWERTYU";
        System.out.println(encodedPotion.EncodePotion(str2));
        String str3 = "KKKKK";
        System.out.println(encodedPotion.EncodePotion(str3));
        String str4 = "KKKKKK";
        System.out.println(encodedPotion.EncodePotion(str4));
    }
}
