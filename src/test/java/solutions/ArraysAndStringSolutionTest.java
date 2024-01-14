package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ArraysAndStringSolutionTest {

    @ParameterizedTest
    @MethodSource("mergeAlternatelyProvider")
    void testMergeAlternately(String word1, String word2, String expectedMerged) {
        Assertions.assertEquals(expectedMerged, ArraysAndStringSolution.mergeAlternately(word1, word2));
    }


    @ParameterizedTest
    @MethodSource("gcdOfStringsProvider")
    void testGcdOfStrings(String str1, String str2, String output) {
        Assertions.assertEquals(output, ArraysAndStringSolution.gcdOfStrings(str1, str2));
    }

    @ParameterizedTest
    @MethodSource("kidsWithCandiesProvider")
    void testkidsWithCandies(int[] candies, int extraCandies, List<Boolean> result) {
        Assertions.assertEquals(result, ArraysAndStringSolution.kidsWithCandies(candies, extraCandies));
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

    private static Stream<Object[]> gcdOfStringsProvider() {
        return Stream.of(
                new Object[][]{
                        {"ABCABC", "ABC", "ABC"},
                        {"ABABAB", "ABAB", "AB"},
                        {"LEET", "CODE", ""}
                }
        );
    }

    private static Stream<Object[]> kidsWithCandiesProvider() {
        return Stream.of(
                new Object[][]{
                        {new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)},
                        {new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)},
                        {new int[]{12, 1, 12}, 10, List.of(true, false, true)}
                }
        );
    }
}