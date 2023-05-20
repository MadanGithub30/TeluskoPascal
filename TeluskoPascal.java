
import java.util.*;

public class TeluskoPascal {
    private static Map<String, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int numRows = 10; 
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(PascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int PascalValue(int row, int col) {
        String key = row + "," + col;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int value;
        if (col == 0 || col == row) {
            value = 1;
        } else {
            value = PascalValue(row - 1, col - 1) + PascalValue(row - 1, col);
        }
        memo.put(key, value);
        return value;
    }
}
