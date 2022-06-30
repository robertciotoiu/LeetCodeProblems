import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 16. 3Sum Closest
 * <p>
 * Medium
 * <p>
 * <p>
 * <p>
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * <p>
 * Return the sum of the three integers.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 * <p>
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Set<Integer> sums = new TreeSet<>();
        fillSums(sums, nums);
        if (sums.contains(target)) return target;
        else return findClosestNumber(new ArrayList<>(sums), target);
    }

    private void fillSums(Set<Integer> sums, int[] nums) {
        for (int fIndex = 0; fIndex < nums.length - 2; fIndex++) {
            for (int sIndex = fIndex + 1; sIndex < nums.length - 1; sIndex++) {
                for (int tIndex = sIndex + 1; tIndex < nums.length; tIndex++) {
                    int currentSum = nums[fIndex] + nums[sIndex] + nums[tIndex];
                    sums.add(currentSum);
                }
            }
        }
    }

    private int findClosestNumber(ArrayList<Integer> sums, int target) {
        int firstIndex = 0;
        int lastIndex = sums.size() - 1;
        int insertionPoint = Math.abs(Collections.binarySearch(sums, target)) - 1;
        if (insertionPoint - 1 < firstIndex) return sums.get(firstIndex);
        if (insertionPoint > lastIndex) return sums.get(lastIndex);

        int firstNumber = sums.get(insertionPoint - 1);
        int secondNumber = sums.get(insertionPoint);
        if (Math.abs(target - firstNumber) < Math.abs(target - secondNumber)) {
            return firstNumber;
        } else return secondNumber;
    }
}
