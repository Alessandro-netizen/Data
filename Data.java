
public class Main {
    public static void main(String[] args) {
        System.out.println("MAX value: " + Data.MAX);
        Data d1 = new Data(7, 5);
        System.out.println("Grid after instantiation (before repopulation):\n" + d1);
        d1.repopulate();
        System.out.println("\nGrid after repopulation:\n" + d1);
        int increasingCols1 = d1.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in random grid: " + increasingCols1);

        int[][] testArr = {
                {10, 50, 40},
                {20, 40, 20},
                {30, 50, 30}
        };
        Data d2 = new Data(testArr);
        System.out.println("\nTest Grid:\n" + d2);
        int increasingCols2 = d2.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid: " + increasingCols2);

        int[][] testArr2 = {
                {10, 20, 50},
                {30, 35, 60},
                {20, 40, 70},
                {40, 45, 80}
        };
        Data d3 = new Data(testArr2);
        System.out.println("\nTest Grid 2:\n" + d3);
        int increasingCols3 = d3.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid 2: " + increasingCols3);

        int[][] testArr3 = {
                {5}
        };
        Data d4 = new Data(testArr3);
        System.out.println("\nTest Grid 3 (single row):\n" + d4);
        int increasingCols4 = d4.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid 3: " + increasingCols4);

        int[][] testArr4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Data d5 = new Data(testArr4);
        System.out.println("\nTest Grid 4 (all increasing columns):\n" + d5);
        int increasingCols5 = d5.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid 4: " + increasingCols5);

        int[][] testArr5 = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        Data d6 = new Data(testArr5);
        System.out.println("\nTest Grid 5 (no increasing columns):\n" + d6);
        int increasingCols6 = d6.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid 5: " + increasingCols6);

        // Test with the grid provided in the first image
        int[][] testArrImage1 = {
                {10, 50, 40},
                {20, 40, 20},
                {30, 50, 30}
        };
        Data d7 = new Data(testArrImage1);
        System.out.println("\nTest Grid from Image 1:\n" + d7);
        int increasingCols7 = d7.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid from image 1: " + increasingCols7);

        // Test with the grid provided in the second image
        int[][] testArrImage2 = {
                {10, 540, 440, 440},
                {220, 450, 440, 190}
        };
        Data d8 = new Data(testArrImage2);
        System.out.println("\nTest Grid from Image 2:\n" + d8);
        int increasingCols8 = d8.countIncreasingCols();
        System.out.println("\nNumber of increasing columns in test grid from image 2: " + increasingCols8);
    }
}
