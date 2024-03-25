//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
       // Scanner media = new Scanner(System.in);
       // System.out.println("Digite um numero: ");
       //double a = media.nextDouble();
       // System.out.println("Digite outro numero: ");
       //double b = media.nextDouble();
       // double soma = (a + b) /2;
       // System.out.println("A media dos dois numeros são: " + soma);

       
       double z = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
       double y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));
       double soma = (z + y) /2;
       JOptionPane.showInputDialog("A media desses dois numeros são: " + soma);


       

    }
    
}
