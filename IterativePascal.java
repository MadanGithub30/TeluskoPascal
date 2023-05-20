
import java.util.*;
public class IterativePascal {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generateascalTriangle(numRows);
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generateascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                currRow.add(sum);
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}