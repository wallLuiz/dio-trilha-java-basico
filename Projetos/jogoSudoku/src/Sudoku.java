import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Bem-vindo ao Sudoku no Terminal =====");
        board.generate(); 

        while (!board.isComplete()) {
         board.print();
     
         System.out.print("Digite a linha (0-8): ");
         int row = scanner.nextInt();
     
         System.out.print("Digite a coluna (0-8): ");
         int col = scanner.nextInt();
     
         System.out.print("Digite o número (1-9): ");
         int num = scanner.nextInt();
     
         if (board.isValidMove(row, col, num)) {
             board.setCell(row, col, num);
         } else {
             System.out.println("Movimento inválido! Tente novamente.");
         }
     }
     
     // Após completar
     board.print();
     if (board.isValidSolution()) {
         System.out.println("[OK] Parabéns! Sudoku resolvido corretamente!");
     } else {
         System.out.println("[X] Sudoku preenchido, mas incorreto.");
     }
    }
   }
