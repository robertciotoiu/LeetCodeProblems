import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumClosestTest {
    ThreeSumClosest threeSumClosest = new ThreeSumClosest();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2),
                Arguments.of(new int[]{0, 0, 0}, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    public void threeSumClosestTest(int[] nums, int target, int expected) {
        int actual = threeSumClosest.threeSumClosest(nums, target);
        assertEquals(expected, actual);
    }
}