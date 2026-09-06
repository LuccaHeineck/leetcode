class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        substring = ""
        max_length = 0

        for i in range(len(s)):
            if s[i] in substring:
                repeated_index = substring.index(s[i])
                substring = substring[repeated_index + 1:]

            substring += s[i]
            max_length = max(max_length, len(substring))

        return max_length