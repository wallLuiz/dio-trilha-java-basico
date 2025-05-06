import java.util.Random;

public class Board {
    private int[][] board = new int[9][9];

    public void generate() {
        Random rand = new Random();
        // Gera números aleatórios em posições aleatórias
        for (int i = 0; i < 10; i++) {
            int row = rand.nextInt(9);
            int col = rand.nextInt(9);
            int num = rand.nextInt(9) + 1;

            if (isValidMove(row, col, num)) {
                board[row][col] = num;
            }
        }
    }

    public void print() {
        System.out.println("  0 1 2 3 4 5 6 7 8");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 9; j++) {
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col, int num) {
        if (board[row][col] != 0) return false;

        // Linha
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
        }

        // Coluna
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // Bloco 3x3
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    public void setCell(int row, int col, int num) {
        board[row][col] = num;
    }

    public boolean isComplete() {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0) return false;
            }
        }
        return true;
    }

    public boolean isValidSolution() {
        // Verifica linhas
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }

        // Verifica colunas
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int num = board[i][j];
                if (num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }

        // Verifica blocos 3x3
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] seen = new boolean[10];
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = board[i][j];
                        if (num < 1 || num > 9 || seen[num]) return false;
                        seen[num] = true;
                    }
                }
            }
        }

        return true;
    }
}