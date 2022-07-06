import java.util.HashMap;
import java.util.HashSet;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Difficulty: Medium
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstring {
    public int findWithoutRepeatingCharacters(String input) {
        HashMap<Character, Integer> currentSearch = new HashMap<>();
        HashSet<String> substrings = new HashSet<>();
        Integer repeatingCharPos;
        String longestSubstring = "";
        int currentSubstringStartingPos = 0;

        int i = 0;
        while (i != input.length()) {
            //check if the character added to the Hashmap is already present
            //if it is we need to save into another hashmap the current substring and clean the currentSearch
            //then we need to restart the search from the first occurrence of the repeating char.
            repeatingCharPos = currentSearch.get(input.charAt(i));
            if (repeatingCharPos == null) {
                currentSearch.put(input.charAt(i), i);
                i++;
            } else {
                substrings.add(input.substring(currentSubstringStartingPos, i));
                currentSearch.clear();
                i = repeatingCharPos + 1;
                currentSubstringStartingPos = i;
            }
        }

        if (currentSearch.size() != 0) substrings.add(input.substring(currentSubstringStartingPos));

        for (String substring : substrings) {
            if (substring.length() > longestSubstring.length()) longestSubstring = substring;
        }

        return longestSubstring.length();
    }
}
