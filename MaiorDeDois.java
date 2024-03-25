import javax.swing.JOptionPane;

public class MaiorDeDois {
    public static void main(String[] args) {
        double numero1 = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero "));
        double numero2 = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero "));
        if(numero1 >= numero2){
            JOptionPane.showMessageDialog(null, numero1 + " é maior");
        }
        else{
            JOptionPane.showMessageDialog(null, numero2 + " é maior");
        }
    }
    
}
