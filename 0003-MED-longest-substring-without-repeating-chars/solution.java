// WRONG
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        StringBuilder substring = new StringBuilder();
        ArrayList<StringBuilder> possibleResults = new ArrayList();

        for (int i = 0; i < chars.length; i++) {
            if (!(i > 0 && chars[i] == chars[i - 1])) {
                if (!(substring.indexOf(String.valueOf(chars[i])) != -1)) {
                    substring.append(chars[i]);
                }
                substring = new StringBuilder();
            }
            System.out.println(substring);
            possibleResults.add(substring);
        }

        System.out.println(possibleResults);

        return possibleResults.stream()
                .max(Comparator.comparingInt(StringBuilder::length))
                .map(StringBuilder::length)
                .orElse(0);
    }
}