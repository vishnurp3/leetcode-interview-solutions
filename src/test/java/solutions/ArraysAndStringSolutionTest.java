package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArraysAndStringSolutionTest {

    @ParameterizedTest
    @MethodSource("mergeAlternatelyProvider")
    void testMergeAlternately(String word1, String word2, String expectedMerged) {
        Assertions.assertEquals(expectedMerged, ArraysAndStringSolution.mergeAlternately(word1, word2));
    }

    private static Stream<Object[]> mergeAlternatelyProvider() {
        return Stream.of(
                new Object[][]{
                        {"abc", "pqr", "apbqcr"},
                        {"ab", "pqrs", "apbqrs"},
                        {"abcd", "pq", "apbqcd"}
                }
        );
    }
}