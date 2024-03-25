// Pergunte um numero para o usuario.
//Se o número for Divisivel por 4 ou 10, imprima PIM.
//Se não, imprima o próprio número. 

import javax.swing.JOptionPane;

public class PimSimples{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if(numero % 4 == 0 || numero % 10 == 0 ){
            JOptionPane.showMessageDialog(null, "PIM");
        } 
        else{
            JOptionPane.showMessageDialog(null, "O número é " + numero);
        }
        
    }

}