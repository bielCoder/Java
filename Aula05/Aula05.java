package Aula05;

import java.util.Scanner;

public class Aula05 {
    // Scanner

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Variáveis
        int idade;
        String nome;

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        // Saída de dados
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        
        // Fechar o scanner
        scanner.close();
    }
}
