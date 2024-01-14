package solutions;

public class ArraysAndStringSolution {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; (i < word1.length() || j < word2.length()); i++, j++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (j < word2.length()) {
                sb.append(word2.charAt(j));
            }
        }
        return sb.toString();
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!((str1 + str2).equals(str2 + str1))) {
            return "";
        }
        int str1Length = str1.length();
        int str2Length = str2.length();
        while (str2Length > 0) {
            int temp = str2Length;
            str2Length = str1Length % str2Length;
            str1Length = temp;
        }
        return str1.substring(0, str1Length);
    }
}
