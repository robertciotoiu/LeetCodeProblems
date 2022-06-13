import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * 5. Longest Palindromic Substring
 * <p>
 * Medium
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindromicSubstring {

    /**
     * Finds the longest substring which is a palindrome.
     *
     * @param input string
     * @return longest palindrome string
     */
    public String find(String input) {
        var longestSubstring = IntStream.range(0, input.length())
                .parallel()
                .mapToObj(i -> generateSubstrings(input, input.length() - i))
                .map(i -> i.parallelStream().filter(this::isPalindrome).findFirst())
                .filter(Optional::isPresent)
                .findFirst();

        return longestSubstring.orElse(Optional.empty()).orElse("");
    }

    /**
     * Generates all combination of substrings of length @length for an input @input string.
     *
     * @param input  string
     * @param length length of substring to generate
     * @return a List of all combination of length @length based on the input string
     */
    private List<String> generateSubstrings(String input, int length) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i <= input.length() - length; i++) {
            substrings.add(
                    input.substring(i, length + i)
            );
        }
        return substrings;
    }

    /**
     * Checks if input string is a palindrome
     *
     * @param input test to be checked
     * @return true if string is palindrome or false otherwise
     */
    private boolean isPalindrome(String input) {
        for (int i = 0, j = input.length() - 1; i < input.length() / 2 || j > input.length() / 2; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
