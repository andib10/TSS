import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoverageTest {
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