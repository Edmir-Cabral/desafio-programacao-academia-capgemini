package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degraus;

        System.out.print("Entre com a quantidade de degraus: ");
        degraus = sc.nextInt();
        printDegraus(degraus);

    }
    // Função para criar e imprimir a escada
    public static void printDegraus(int degraus){
        List<String> quantidade = new ArrayList<>();
        //Percorre a quantidade de degraus digitados e armazena em uma lista repetindo o caracter sempre que faz o loop
        for (int i = 0; i < degraus; i++) {
            quantidade.add(" ".repeat(degraus - i) + "*".repeat(i + 1));
        }
        //For que imprimi os caracters
        for (String d : quantidade) {
            System.out.println(d);
        }
    }
}
