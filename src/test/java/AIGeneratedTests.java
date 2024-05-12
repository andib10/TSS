import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AIGeneratedTests {

    @Test
    public void testEmptyArray() {
        assertEquals(-1, Main.maxArea(new int[]{}, 0));
    }

    @Test
    public void testSingleElement() {
        assertEquals(-1, Main.maxArea(new int[]{100}, 1));
    }

    @Test
    public void testNegativeHeight() {
        assertEquals(-1, Main.maxArea(new int[]{-1}, 1));
//        assertEquals(-2, Main.maxArea(new int[]{-1}, 1));
    }

    @Test
    public void testMinimumValidInput() {
        assertEquals(1, Main.maxArea(new int[]{1, 1}, 2));
    }

    @Test
    public void testComplexInput() {
        assertEquals(49, Main.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 9));
    }

    @Test
    public void testOutOfBoundHeight() {
        assertEquals(-2, Main.maxArea(new int[]{0, 10001}, 2));
    }

    @Test
    public void testLargeInputValid() {
        int[] heights = new int[100001];
        for (int i = 0; i < 100001; i++) {
            heights[i] = 1;
        }
        assertEquals(-1, Main.maxArea(heights, 100001));
    }

    @Test
    public void testLargeInputInvalidHeight() {
        int[] heights = new int[100001];
        for (int i = 0; i < 100000; i++) {
            heights[i] = 1;
        }
        heights[100000] = 10001; // invalid height
        assertEquals(-1, Main.maxArea(heights, 100001));
    }

    @Test
    public void testMaxBoundaryValues() {
        int[] heights = new int[100000];
        for (int i = 0; i < 100000; i++) {
            heights[i] = 10000;
        }
        assertEquals(999990000, Main.maxArea(heights, 100000));
    }

    @Test
    public void testMaximumHeightArray() {
        int[] heights = new int[100000];
        for (int i = 0; i < 100000; i++) {
            heights[i] = 10000;
        }
        assertEquals(999990000, Main.maxArea(heights, 100000));
    }

    @Test
    public void testTwoElementsDifferentHeights() {
        assertEquals(0, Main.maxArea(new int[]{0, 10000}, 2));
    }

    @Test
    public void testThreeElementsVariation() {
        assertEquals(20000, Main.maxArea(new int[]{10000, 5000, 10000}, 3));
//        assertEquals(10000, Main.maxArea(new int[]{10000, 5000, 10000}, 3));
    }


    /////

    @Test
    public void testInvalidNLow() {
        assertEquals(-1, Main.maxArea(new int[]{1}, 1));
    }

    @Test
    public void testInvalidNHigh() {
        int[] heights = new int[100001];
        assertEquals(-1, Main.maxArea(heights, 100001));
    }

    @Test
    public void testInvalidHeightLow() {
        assertEquals(-2, Main.maxArea(new int[]{1, -1}, 2));
    }

    @Test
    public void testInvalidHeightHigh() {
        assertEquals(-2, Main.maxArea(new int[]{1, 10001}, 2));
    }

    @Test
    public void testCorrectMaxAreaCalculation() {
        assertEquals(49, Main.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 9));
    }

    @Test
    public void testHeightComparisonTrue() {
        assertEquals(1, Main.maxArea(new int[]{1, 2}, 2));
    }

    @Test
    public void testHeightComparisonFalse() {
        assertEquals(1, Main.maxArea(new int[]{2, 1}, 2));
    }


}
