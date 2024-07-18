import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero; double saldo; String agencia; String nomeCliente;   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu Nome");
            nomeCliente = scanner.nextLine();
        
            while (true) {
                System.out.println("Por favor, digite a Agência");
                agencia = scanner.nextLine();
                if (agencia.length() <= 5) {
                    break;
                } else {
                    System.out.println("A entrada deve ter no máximo 4 caracteres.");
                }
            }
   
            while (true) {
                System.out.println("Por favor, digite o número da Agência");
                numero = scanner.nextInt();
                if (numero <= 9999) {
                    break;
                } else {
                    System.out.println("o limite para a aprovação é 4 digitos");
                }
            }
        
            while (true) {
                System.out.println("Por favor, digite o saldo");
                saldo = scanner.nextDouble();
                if (saldo <= 999.99) {
                    break;
                } else {
                    System.out.println("o limite para a aprovação é 999.99");
                }
            }
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numero+ " e seu saldo de crédito " +saldo+ " foi aprovado e já está disponível para saque");
        
        scanner.close();
    }
        
}
