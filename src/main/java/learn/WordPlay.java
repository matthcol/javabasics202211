package learn;

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
        return false;
    }
}
