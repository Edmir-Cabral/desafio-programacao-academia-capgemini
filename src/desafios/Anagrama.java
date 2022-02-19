package desafios;

import java.util.*;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite a palavra: ");
        palavra = sc.nextLine();
        qtdAnagramasPares(palavra);

    }
    // Função para reverter uma String
    public static String reverter(String palavra){
        StringBuilder strb = new StringBuilder(palavra);
        palavra = strb.reverse().toString();

        return palavra;
    }
    // Função para mostrar a quantidade anagramas pares (precisa de ajustes)
    public static void qtdAnagramasPares(String palavra){

        List<String> anagramas = new ArrayList<>();
        // Divide a String em substrings e guarda em uma lista
        for(int i = 0; i <palavra.length(); i++) {
            for(int j = i; j < palavra.length(); j++) {
                if(palavra.charAt(i) == palavra.charAt(j) && i != j) {
                    String a = palavra.substring(i, j);
                    String b = palavra.substring(i + 1, j + 1);
                    String c = palavra.substring(i, i + 1);
                    anagramas.add(c);
                    anagramas.add(a);
                    anagramas.add(b);
                }
            }
        }
        // Função para detectar os anagramas pares e remover os duplicados
        List<String> lista = new ArrayList<>(anagramas);
        String revertida;
        for(int i=0; i< lista.size(); i++){
            revertida = reverter(lista.get(i));
            if(!(revertida.equalsIgnoreCase(lista.get(i)))){
                lista.remove(i);
            }
        }
        Set<String> anagramasPares = new HashSet<>(lista);
        System.out.println(anagramasPares.size());
    }
}
