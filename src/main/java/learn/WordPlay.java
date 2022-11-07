package learn;

import java.util.Arrays;

public class WordPlay {

    // class method

    /**
     * verify if a word is a palindrome
     * @param word
     * @return true if a word is a palindrome
     */
    public static boolean isPalindromeWord(String word){
        int n = word.length();
        for (int i = 0; i < n / 2; i++){
            if (word.charAt(i) !=  word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] letters1 = word1.toCharArray();
        char[] letters2 = word2.toCharArray();
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        return Arrays.equals(letters1, letters2);
    }
}
