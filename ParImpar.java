import javax.swing.JOptionPane;

public class ParImpar { 
    public static void main(String[] args) {
        String auxiliar = JOptionPane.showInputDialog("Digite um numero inteiro: ");
        // Lendo a palavra e armazenamento em auxiliar

    int numero = Integer.parseInt(auxiliar); // Convertendo a palavra em inteiro e armazenando em numero
    int resto = numero %2; // Calculando o resto do numero por 2 e armazenando em resto  

    if(resto == 0){ //Verificando o valor de resto
        JOptionPane.showMessageDialog(null, numero + " e par"); //Saída
    }
    else{
        JOptionPane.showMessageDialog(null, numero + "e impar"); //Saída
    }
    }
    
}
