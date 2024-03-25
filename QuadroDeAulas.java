import java.util.Scanner;

import javax.swing.JOptionPane;

public class QuadroDeAulas {
    public static void main(String[] args) {
        Scanner aulas = new Scanner(System.in);
        System.out.println("Que dia é hoje?");
        int segunda_feira = aulas.nextInt();
        int terca_feira = aulas.nextInt();
        int quarta_feira = aulas.nextInt();
        int quinta_feira = aulas.nextInt();
        int sexta_feira = aulas.nextInt();

        if(segunda_feira == 0){
            JOptionPane.showMessageDialog(null, "AULA 19:00 ");
        }
        else{
            JOptionPane.showMessageDialog(null, "SEM AULAS");
        }



        


        
    }
    
}
