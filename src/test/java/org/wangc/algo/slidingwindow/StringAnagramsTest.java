package org.wangc.algo.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringAnagramsTest {

    String s1 = "ppqp";
    String p1 = "pq";
    List<Integer> a1 = Arrays.asList(1, 2);

    String s2 = "abbcabc";
    String p2 = "abc";
    List<Integer> a2 = Arrays.asList(2, 3, 4);

    @Test
    void findStringAnagrams() {
        assertEquals(a1, StringAnagrams.findStringAnagrams(s1, p1));
        assertEquals(a2, StringAnagrams.findStringAnagrams(s2, p2));
    }
}