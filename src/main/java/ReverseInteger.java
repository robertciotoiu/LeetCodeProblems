public class ReverseInteger {
    /**
     * 7. Reverse Integer
     * <p>
     * Medium
     * <p>
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * <p>
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 123
     * Output: 321
     * Example 2:
     * <p>
     * Input: x = -123
     * Output: -321
     * Example 3:
     * <p>
     * Input: x = 120
     * Output: 21
     * <p>
     * <p>
     * Constraints:
     * <p>
     * -231 <= x <= 231 - 1
     */
    public int reverse(int x) {
        int index = 10;
        long result = 0;
        while (x != 0) {
            result = result * index + x % index;
            x = x / index;
        }
        return isValid(result) ? (int) result : 0;
    }

    private boolean isValid(long value) {
        return value < Integer.MAX_VALUE && value > Integer.MIN_VALUE;
    }
}
