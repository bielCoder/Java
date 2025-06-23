package Aula08;

import java.util.Scanner;

public class Aula08 {
    public static void main(String[] args) {
     
           Scanner scanner = new Scanner(System.in);
           System.out.print("Entre com um número inteiro: ");
              int number = scanner.nextInt();
              System.out.println("O número informado foi: " + number);
              scanner.close();
    }
}
