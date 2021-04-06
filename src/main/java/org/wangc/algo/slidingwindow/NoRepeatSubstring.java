package org.wangc.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 05. 给定一个整数数组 nums 和一个整数 'K' ，找到该数组的任意大小为 K 的连续子数组和的最大值
 */
public class NoRepeatSubstring {

    public static int findLength(String str) {

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charIndexMap.containsKey(rightChar)) {
                // charIndexMap 中不仅包含当前窗口的字符，还包括之前被滑出的字符，
                // 因此需要 max 来获取当前重复 char 的下一个字符作为 start
                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
            }
            charIndexMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

}
