
//        8				|	                                    |
//        7				|	                                    |	            |
//        6				|	    |	                            |	            |
//        5				|	    |	            |	            |	            |
//        4				|	    |	            |	    |	    |	            |
//        3				|	    |	            |	    |	    |	    |	    |
//        2				|	    |	    |	    |	    |	    |	    |	    |
//        1	     |     	|	    |	    |	    |	    |	    |	    |	    |
//               0      1       2       3       4       5       6       7       8
//                      ^                                                       ^

/***
Constraints:

        n == height.length
        2 <= n <= 10^5
        0 <= height[i] <= 10^4

Clase partitionare:

    N1: n < 2
    N2: n ok
    N3: n > 10^5

    H1: fiecare height se afla in [0, 10000]
    H2: cel putin un height nu se afla in [0, 10000]

   1. C11: N1 si H1
   2. C12: N1 si H2
   3. C21: N2 si H1
   4. C22: N2 si H2
   5. C31: N3 si H1
   6. C32: N3 si H2


Boundary testing:
    N1: 1
    N2: 2, 100000
    N3: 100001

    H1: toate elem cu 0 || toate cu 10000
    H2: un elem -1 sau 10001 || toate -1 sau 10001

    C11: [0] , [10000]

    C12: [-1], [10001]

    C21: [0, 0], [10000, 10000] || [0, 0, ...] , [10000, 10000, ...] de 100000 ori

    C22: [-1, h], [10001, h] ||
        [-1, -1] , [10001, 10001] ||
        [-1, h1, h2 , ...] , [10001, h1, h2, ...] de 100000 ori ||
        [-1, -1 ...] , [10001, 10001, ...] de 100000 ori

    C31: [0, 0, 0, ..], [10000, 10000, ...] de 100001 ori

    C32: [-1, h1, h2 , ...] , [10001, h1, h2, ...] de 100001 ori ||
         [-1, -1 ...] , [10001, 10001, ...] de 100001 ori

*/


public class Main {
    public static void main(String[] args){

    }

    public static int maxArea(int[] height, int n) {

        int leftPointer = 0;
        int rightPointer = n - 1;
        int maxArea = 0;

        if (n < 2 || n > 100000) { //1
            return -1; //2
        }

        for (int i = 0; i < n; i++) { //3
            if (height[i] < 0 || height[i] > 10000) { //4
                return -2; //5
            }
        }

        while (leftPointer < rightPointer) { //6
            int currentArea = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer); //7
            maxArea = Math.max(maxArea, currentArea); //8

            if (height[leftPointer] < height[rightPointer]) { //9
                leftPointer++; //10
            } else {
                rightPointer--; //11
            }
        }
        return maxArea; //12
    }
}
