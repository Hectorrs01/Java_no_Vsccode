import java.util.Scanner;

import javax.swing.JOptionPane;

public class Retangulo {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //System.out.println("Digite a base do retangulo: ");
        //double base = teclado.nextDouble();
        //System.out.println("Digite a altura do retangulo: ");
        //double altura = teclado.nextDouble();
        //double Area = base * altura;
        //System.out.println(" Qual a area do reatangulo é: " + Area);
        //teclado.close();

        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        double area = base * altura;
        JOptionPane.showInputDialog("A area do retangulo é: " + area);


        
    }
    
}
