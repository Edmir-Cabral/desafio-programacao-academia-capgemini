package desafios;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
        checarSenha(senha);

    }
    // Função para checar se a senha corresponde aos requisitos
    public static void checarSenha(String senha) {
        if(senha.length() < 6){
            int falta = 6 - senha.length();
            System.out.println("A senha precisa de mais "+falta+" caracters!");
        }
        int numero = 0;
        int maiuscula = 0;
        int minuscula = 0;
        int charEspecial = 0;
        for (char dig : senha.toCharArray()) {
            if (dig >= '0' && dig <= '9') {
                numero +=1;
            } else if (dig >= 'A' && dig <= 'Z') {
                maiuscula +=1;
            } else if (dig >= 'a' && dig <= 'z') {
                minuscula +=1;
            } else if(dig == '!' || dig == '@' || dig == '#' || dig == '$' || dig == '%' ||
                    dig == '^' || dig == '&' || dig == '*' || dig == '(' || dig == ')' ||
                    dig == '-' || dig == '+'){
                charEspecial +=1;
            }
        }
        if(numero == 0) {
            System.out.println("Precisa conter um número!");
        }
        if(maiuscula == 0) {
            System.out.println("Precisa de uma letra maiúscula!");
        }
        if(minuscula == 0) {
            System.out.println("Precisa de uma letra minúscula!");
        }
        if(charEspecial == 0) {
            System.out.println("Precisa conter um dos seguintes carateres especiais: !@#$%^&*()-+");
        }
    }
}
