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
     * PROs:
     * - Very simple to algorithm to understand.
     * - Making use of Java Streams and parallelization.
     * - Even if theoretically the complexity is O(n^2), the algorithm will be pretty fast in practice because:
     * - each iteration of the algorithm is parallelized.
     * - at each isPalindrome check we iterate only string.length/2 but in many cases we return earlier if
     * invalid character is found
     * CONs:
     * - High complexity: O(1) + O(2) + ... + O(n) = (O(n) * O(n+1))/2 = O(n^2)
     * - Average in terms of performance(according to LeetCode).
     * Explanation:
     * As we want to find the longest substring, we will go from the longest substring to the smallest.
     * (0.) We create a stream of ints from 0 until input.length() to facilitate Stream parallelization.
     * 1. We generate all substrings of a string for a given length, where length ranges from @input.length -> 0
     * We map each previous int to List<String> - generated substrings.
     * 2. We want to filter each list to find the palindromes, and we use findFirst just to find the first substring
     * of a given length, instead of finding any which will give us a different result each time(BUT CORRECT, FOR THE
     * GIVEN CONSTRAINTS!). Using findAny will increase performance, but will not pass LeetCode tests...(in real word,
     * we would have smarter tests than the current ones from LeetCode and we would use findAny, for these current constraints!)
     * To filter we will use the isPalindrome method which will:
     * - compare if string[0] == string[n-1], string[1] == string[n-2] ...
     * return immediately if the condition is not satisfied.
     * by doing this we are halving the number of iterations for each string check!
     * and we are also lowering the number of iterations by returning immediately.
     * 3. We will have now a Stream<Optional<String>>, because from each List<String> we took only the first
     * valid palindrome. It is an Optional, because some lists may not have any palindrome. For this, we want
     * to filter only the present ones. Only then, we can perform findFirst to find the longest one.(Because of how we ranged from 0 to input.length, where to 0 we mapped actually
     * the longest string)
     * 4. We unwrap the optionals and return the longest palindromic substring if exists or an empty string.
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
