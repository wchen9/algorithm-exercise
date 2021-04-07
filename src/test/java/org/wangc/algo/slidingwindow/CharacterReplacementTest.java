package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterReplacementTest {

    String s1 = "aabccbb";
    int k1 = 2;
    int r1 = 5;

    String s2 = "abbcb";
    int k2 = 1;
    int r2 = 4;

    String s3 = "abccde";
    int k3 = 1;
    int r3 = 3;

    @Test
    void findLength() {
        assertEquals(r1, CharacterReplacement.findLength(s1, k1));
        assertEquals(r2, CharacterReplacement.findLength(s2, k2));
        assertEquals(r3, CharacterReplacement.findLength(s3, k3));
    }
}