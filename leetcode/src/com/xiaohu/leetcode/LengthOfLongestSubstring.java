package com.xiaohu.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (Objects.isNull(s)) {
            return 0;
        }
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                left = Math.max(left, hash.get(s.charAt(i)) + 1);
            }
            hash.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
