
import java.util.Random;

public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int rows, int columns) {
        grid = new int[rows][columns];
    }

    public Data(int[][] arr) {
        grid = arr;
    }

 
    public void repopulate() {
        Random random = new Random();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int val = 0;
                while (val % 10 != 0 || val % 100 == 0) {
                    val = (int) (Math.random() * MAX + 1);
                }
                grid[row][col] = val;
            }
        }
    }


    public int countIncreasingCols() {
        int count = 0;
        if (grid != null && grid.length > 0 && grid[0].length > 0) {
            int numRows = grid.length;
            int numCols = grid[0].length;

            for (int col = 0; col < numCols; col++) {
                int increasing = 1; // Initialize with 1 because a single-row column is increasing
                for (int row = 1; row < numRows; row++) {
                    if (grid[row][col] >= grid[row - 1][col]) {
                        increasing++;
                    }
                }
                if (increasing == numRows) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        if (grid == null || grid.length == 0) {
            return "Empty grid";
        }
        String s = "";
        for (int[] row : grid) {
            for (int col : row) {
                s += String.format("%-6d", col); // Format with width 6
            }
            s += "\n";
        }
        return s;
    }

    // There may be instance variables, constructors
    //and methods that are not shown.
}
