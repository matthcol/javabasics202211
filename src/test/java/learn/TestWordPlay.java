package learn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestWordPlay {

    @ParameterizedTest
    @ValueSource(strings = {"hannah", "kayak", "w"})
    void isPalindromeWordOk(String word) {
        boolean ok = WordPlay.isPalindromeWord(word);
        assertTrue(ok);
    }

    @Test
    void isPalindromeWordKo() {
        String word = "ko";
        boolean ok = WordPlay.isPalindromeWord(word);
        assertFalse(ok);
    }

    @ParameterizedTest
    @MethodSource("learn.helper.WordGenerators#generateAnagramWords")
    void isAnagramOk(String word1, String word2) {
        boolean ok = WordPlay.isAnagram(word1, word2);
        assertTrue(ok);
    }

    @ParameterizedTest
    @MethodSource("learn.helper.WordGenerators#generateNonAnagramWords")
    void isAnagramKo(String word1, String word2) {
        boolean ok = WordPlay.isAnagram(word1, word2);
        assertFalse(ok);
    }
}