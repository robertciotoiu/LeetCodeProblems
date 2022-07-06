import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({
            "123,321",
            "-123,-321",
            "120,21",
            "1534236469,0",
    })
    public void reverseTest(int x,int expected) {
        int actual = reverseInteger.reverse(x);
        assertEquals(expected, actual);
    }
}