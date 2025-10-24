public class LoShuMagicSquare {
    public static boolean isLoShuMagicSquare(int[][] square) {
        // Check if all numbers 1–9 are present exactly once
        boolean[] seen = new boolean[10]; // index 0 unused
        for (int[] row : square) {
            for (int num : row) {
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        // Check rows, columns, and diagonals sum to 15
        for (int i = 0; i < 3; i++) {
            int rowSum = square[i][0] + square[i][1] + square[i][2];
            int colSum = square[0][i] + square[1][i] + square[2][i];
            if (rowSum != 15 || colSum != 15) {
                return false;
            }
        }

        int diag1 = square[0][0] + square[1][1] + square[2][2];
        int diag2 = square[0][2] + square[1][1] + square[2][0];
        return diag1 == 15 && diag2 == 15;
    }

    public static void main(String[] args) {
        int[][] square = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};

        if (isLoShuMagicSquare(square)) {
            System.out.println("This is a Lo Shu Magic Square!");
        } else {
            System.out.println("Not a Lo Shu Magic Square.");
        }
    }
}

