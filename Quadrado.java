import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args) {
        //ler Quatro numeros 
        System.out.println("Digite 4 numeros: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        //quadradro de cada um
        int n1quadradro = n1 * n2;
        int n2quadradro = (int) Math.pow(n2, 2);
        int n3quadradro = n3 * n3;
        int n4quadradro = n4 * n4;
        // somar os quadradro e mostrar o resultado
        int soma = n1quadradro + n2quadradro + n3quadradro + n4quadradro;
        System.out.println(" O resultado é: " + soma);
        sc.close();

    }
}