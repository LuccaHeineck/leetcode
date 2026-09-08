class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        StringBuilder substring = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < chars.length; i++) {
            if (substring.indexOf(String.valueOf(chars[i])) != -1) {
                int repeatedIndex = substring.indexOf(String.valueOf(chars[i]));
                substring = new StringBuilder(substring.substring(repeatedIndex + 1));
            }
            
            substring.append(chars[i]);
            if (substring.length() > maxLength) {
                maxLength = substring.length();
            }
        }

        return maxLength;
    }
}