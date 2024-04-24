import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class EquivalencePartition {
    @Test
    public void c11() {
        int[] height = {};
        int[] height2 = {1000};

        assertEquals(-1, Main.maxArea(height));
        assertEquals(-1, Main.maxArea(height2));
    }

    @Test
    public void c12() {
        int[] height = {-10};
        int[] height2 = {20000};

        assertEquals(-1, Main.maxArea(height));
        assertEquals(-1, Main.maxArea(height2));
    }

    @Test
    public void c21() {
        int[] height = {2, 4, 6, 3, 7, 10};
        int[] height2 = {100, 3, 400, 150, 200};

        assertEquals(18, Main.maxArea(height));
        assertEquals(400, Main.maxArea(height2));
    }

    @Test
    public void c22() {
        int[] height = {2, -4, 6, 3, -7, 10};
        int[] height2 = {100, 3, 400, 150, 200000};

        assertEquals(-2, Main.maxArea(height));
        assertEquals(-2, Main.maxArea(height2));
    }

    @Test
    public void c31() {
        int[] arr = new int[120000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i % 100 ;
        }

        int[] arr2 = new int[110000];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i % 500 ;
        }

        assertEquals(-1, Main.maxArea(arr));
        assertEquals(-1, Main.maxArea(arr2));
    }

    @Test
    public void c32() {
        int[] arr = new int[120000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i % 100 - 2 ;
        }

        int[] arr2 = new int[110000];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i % 500 - 4 ;
        }

        assertEquals(-1, Main.maxArea(arr));
        assertEquals(-1, Main.maxArea(arr2));
    }

}
