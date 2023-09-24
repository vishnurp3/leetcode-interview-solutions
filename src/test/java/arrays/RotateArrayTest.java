package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @ParameterizedTest
    @MethodSource("arrayDataProvider")
    void testRotate(int[] inputArray, int noOfSteps, int[] expectedOutput) {
        rotateArray.rotate(inputArray, noOfSteps);
        Assertions.assertArrayEquals(expectedOutput, inputArray);
    }

    private static Stream<Object[]> arrayDataProvider() {
        return Stream.of(
                new Object[][]{
                        {new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}},
                        {new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}}
                }
        );
    }

}
