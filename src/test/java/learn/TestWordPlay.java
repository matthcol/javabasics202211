package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestWordPlay {

    @Test
    void isPalindromeWordOk() {
        String word = "hannah";
        boolean ok = WordPlay.isPalindromeWord(word);
        assertTrue(ok);
    }

    @Test
    void isPalindromeWordKo() {
        String word = "ko";
        boolean ok = WordPlay.isPalindromeWord(word);
        assertFalse(ok);
    }

    @Test
    void isAnagramOk() {
        fail();
    }

    @Test
    void isAnagramKo() {
        fail();
    }
}