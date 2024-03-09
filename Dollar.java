import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ler a cotação do Dollar
        System.out.println("Qual a cotação do Dollar? ");
        double cotacao = sc.nextDouble();
        // Ler a quantidade de Dollares?
        System.out.println("Quantos Dólares? ");
        double dolares = sc.nextDouble();
        // converter para Real
        double Real = dolares*cotacao;
        //mostrar o resultado
        System.out.printf("Voce tem o equivalente a R$ %.2f\n " , + Real);
        sc.close();

        
    }
    
}
