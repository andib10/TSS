import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AllTests {

    // BOUNDARY TESTS
    @Test
    public void c11() {
        int[] height = {0};
        int[] height2 = {10000};
        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c12() {
        int[] height = {-1};
        int[] height2 = {10001};
        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c21() {
        int[] height = {0, 0};
        int[] height2 = {10000, 10000};

        int[] height3 = new int[100000];
        for(int i = 0; i < height3.length; i++){
            height3[i] = 0;
        }

        int[] height4 = new int[100000];
        for(int i = 0; i < height4.length; i++){
            height4[i] = 10000;
        }

        assertEquals(0, Main.maxArea(height, height.length));
        assertEquals(10000, Main.maxArea(height2, height2.length));
        assertEquals(0, Main.maxArea(height3, height3.length));
        assertEquals(999990000, Main.maxArea(height4, height4.length));
    }

    @Test
    public void c22() {
        int[] height = {-1, 30};
        int[] height2 = {10001, 250};

        int[] height3 = {-1, -1};
        int[] height4 = {10001, 10001};

        int[] height5 = new int[100000];
        for(int i = 0; i < height5.length; i++){
            height5[i] = 1;
        }
        height5[300] = -1;


        int[] height6 = new int[100000];
        for(int i = 0; i < height6.length; i++){
            height6[i] = 2;
        }
        height6[500] = 10001;

        int[] height7 = new int[100000];
        for(int i = 0; i < height7.length; i++){
            height7[i] = -1;
        }

        int[] height8 = new int[100000];
        for(int i = 0; i < height8.length; i++){
            height8[i] = 10001;
        }

        assertEquals(-2, Main.maxArea(height, height.length));
        assertEquals(-2, Main.maxArea(height2, height2.length));
        assertEquals(-2, Main.maxArea(height3, height3.length));
        assertEquals(-2, Main.maxArea(height4, height4.length));
        assertEquals(-2, Main.maxArea(height5, height5.length));
        assertEquals(-2, Main.maxArea(height6, height6.length));
        assertEquals(-2, Main.maxArea(height7, height7.length));
        assertEquals(-2, Main.maxArea(height8, height8.length));
    }

    @Test
    public void c31() {

        int[] height = new int[100001];
        for(int i = 0; i < height.length; i++){
            height[i] = 0;
        }

        int[] height2 = new int[100001];
        for(int i = 0; i < height2.length; i++){
            height2[i] = 10000;
        }

        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c32() {
        int[] height = new int[100001];
        for(int i = 0; i < height.length; i++){
            height[i] = 5;
        }
        height[124] = -1;

        int[] height2 = new int[100001];
        for(int i = 0; i < height2.length; i++){
            height2[i] = 8;
        }
        height[246] = 10001;

        int[] height3 = new int[100001];
        for(int i = 0; i < height3.length; i++){
            height3[i] = -1;
        }

        int[] height4 = new int[100001];
        for(int i = 0; i < height4.length; i++){
            height4[i] = 10001;
        }

        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
        assertEquals(-1, Main.maxArea(height3, height3.length));
        assertEquals(-1, Main.maxArea(height4, height4.length));
    }

    //////////////

    // EQUIVALENCE PARTITIONING

    @Test
    public void c11_() {
        int[] height = {};
        int[] height2 = {1000};

        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c12_() {
        int[] height = {-10};
        int[] height2 = {20000};

        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-1, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c21_() {
        int[] height = {2, 4, 6, 3, 7, 10};
        int[] height2 = {100, 3, 400, 150, 200};

        assertEquals(18, Main.maxArea(height, height.length));
        assertEquals(400, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c22_() {
        int[] height = {2, -4, 6, 3, -7, 10};
        int[] height2 = {100, 3, 400, 150, 200000};

        assertEquals(-2, Main.maxArea(height, height.length));
        assertEquals(-2, Main.maxArea(height2, height2.length));
    }

    @Test
    public void c31_() {
        int[] arr = new int[120000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i % 100 ;
        }

        int[] arr2 = new int[110000];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i % 500 ;
        }

        assertEquals(-1, Main.maxArea(arr, arr.length));
        assertEquals(-1, Main.maxArea(arr2, arr2.length));
    }

    @Test
    public void c32_() {
        int[] arr = new int[120000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i % 100 - 2 ;
        }

        int[] arr2 = new int[110000];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i % 500 - 4 ;
        }

        assertEquals(-1, Main.maxArea(arr, arr.length));
        assertEquals(-1, Main.maxArea(arr2, arr2.length));
    }

    //////////
    // STATEMENT COVERAGE, DECISION COVERAGE

    @Test
    public void coverage() {

        Main main = new Main();

        int[] height = {0};

        int[] height2 = {3, 2, -1, 6};

        int[] height3 = {3, 2, 7, 1};

        int[] height4 = new int[100005];

        for(int i = 0; i < height4.length; i++){
            height4[i] = 2;
        }

        int[] height5 = {10002, 4, 8};


        assertEquals(-1, Main.maxArea(height, height.length));
        assertEquals(-2, Main.maxArea(height2, height2.length));
        assertEquals(6, Main.maxArea(height3, height3.length));
        assertEquals(-1, Main.maxArea(height4, height4.length));
        assertEquals(-2, Main.maxArea(height5, height5.length));


    }
}
