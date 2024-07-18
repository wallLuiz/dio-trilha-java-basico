package Projeto;

import java.util.Scanner;

class ParametrosInvalidosExceptions extends Exception {
    public ParametrosInvalidosExceptions(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();
        
        try {
            contador(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm; 
        for (int conta = 1; conta <= contagem; conta++) {
            System.out.println(conta);
        }
    }
}
