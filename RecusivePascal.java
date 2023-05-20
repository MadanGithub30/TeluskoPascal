import java.util.*;

public class RecusivePascal {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = pascalTriangle(numRows);
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }
        generateRows(numRows, triangle);

        return triangle;
    }

    private static void generateRows(int numRows, List<List<Integer>> triangle) {
        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
            return;
        }

        generateRows(numRows - 1, triangle);
        List<Integer> prevRow = triangle.get(numRows - 2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            int sum = prevRow.get(i - 1) + prevRow.get(i);
            currRow.add(sum);
        }
        currRow.add(1);
        triangle.add(currRow);
    }
}
