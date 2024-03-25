import javax.swing.JOptionPane;

public class SomaN {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));
        double e = 1;
        for(int i = 1; i <= n; i++){
            int fatorial = 1;
            for(int parcfatorial = i; parcfatorial >= 2; parcfatorial-- ){
                fatorial *= parcfatorial;
            }
            double parcelasoma = 1 / (double)fatorial;
            e += parcelasoma;
            System.out.println("i: " + i + "fatorial: " + fatorial + "parcelaSoma: " + parcelasoma);
        }
        System.out.println("E: " + e);
        }
    
}
