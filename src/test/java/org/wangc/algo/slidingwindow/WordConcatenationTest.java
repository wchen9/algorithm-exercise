package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordConcatenationTest {

    String s1 = "catfoxcat";
    String[] w1 = {"cat", "fox"};
    List<Integer> r1 = Arrays.asList(0, 3);

    String s2 = "catcatfoxfox";
    String[] w2 = {"cat", "fox"};
    List<Integer> r2 = Arrays.asList(3);

    @Test
    void findWordConcatenation() {
        assertEquals(r1, WordConcatenation.findWordConcatenation(s1, w1));
        assertEquals(r2, WordConcatenation.findWordConcatenation(s2, w2));
    }
}