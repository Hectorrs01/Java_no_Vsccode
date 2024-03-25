// Você foi contratado por um cinema para realizar um programa que calcula o valor do ingresso, a partir da iadde.
//se menor de 2 anos grátis, até 18 anos paga meia, com 65 ou mais paga meia.
//O programa deve perguntar além da idade, o preço  do ingresso integral para realizar os cálculos.

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do ingresso? ");
        double valoringresso = leitor.nextDouble();
        System.out.println("Digite a sua idade ");
        int idade = leitor.nextInt();

        if(idade<2){
            System.out.println("GRÁTIS");
        }
        else if(idade<18){   
        System.out.println("PAGA MEIA " + valoringresso/2);
        }
        else if(idade<65){
            System.out.println("INTEIRA");
        }
        else{
            System.out.println("O valor é " + valoringresso/2);
        }
        leitor.close();
    }
    
}
