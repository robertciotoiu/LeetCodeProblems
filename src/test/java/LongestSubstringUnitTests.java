import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringUnitTests {

    LongestSubstring classUnderTest = new LongestSubstring();

    @Test
    public void testCaseSensitivity() {
        //given
        var inputStr = "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        var expected = 55;
        //when
        var result = classUnderTest.findWithoutRepeatingCharacters(inputStr);
        //then
        assertEquals(expected, result, "Expected: " + inputStr + "\nResult: " + result + ".\nHint:" +
                "Search should be case sensitive");
    }

    @Test
    public void testOneRepeatingChar() {
        //given
        var inputStr = "bbbbbbbb";
        var expected = 1;
        //when
        var result = classUnderTest.findWithoutRepeatingCharacters(inputStr);
        //then
        assertEquals(expected, result, "Expected: " + inputStr + "\nResult: " + result);

    }

    @Test
    public void testTheResetFromPreviousOccurrence() {
        //given
        var inputStr = "dvdf";
        var expected = 3;
        //when
        var result = classUnderTest.findWithoutRepeatingCharacters(inputStr);
        //then
        assertEquals(expected, result, "Expected: " + inputStr + "\nResult: " + result);
    }

    @Test
    public void testTheResetFromPreviousOccurrenceNotInfiniteLoop() {
        //given
        var inputStr = "pwwkew";
        var expected = 3;
        //when
        var result = classUnderTest.findWithoutRepeatingCharacters(inputStr);
        //then
        assertEquals(expected, result, "Expected: " + inputStr + "\nResult: " + result);
    }

    @Test
    public void testSample1() {
        //given
        var inputStr = "abcabcbb";
        var expected = 3;
        //when
        var result = classUnderTest.findWithoutRepeatingCharacters(inputStr);
        //then
        assertEquals(expected, result, "Expected: " + inputStr + "\nResult: " + result);

    }
}
