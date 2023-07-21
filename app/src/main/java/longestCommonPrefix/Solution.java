package longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int longestPrefixIndex = 0;

        while (true) {
            if (longestPrefixIndex >= strs[0].length()) {
                return strs[0].substring(0, longestPrefixIndex);
            }

            char longestPrefixEnd = strs[0].charAt(longestPrefixIndex);

            for (int i = 1; i < strs.length; i++) {
                if (longestPrefixIndex >= strs[i].length()) {
                    return strs[0].substring(0, longestPrefixIndex);
                }
                
                if (strs[i].charAt(longestPrefixIndex) != longestPrefixEnd) {
                    return strs[0].substring(0, longestPrefixIndex);
                }
            }

            longestPrefixIndex += 1;
        }
    }    
}
