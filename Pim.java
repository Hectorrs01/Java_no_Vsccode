public class Pim {
    //escreva um programa que imprima os numeros de 1 a 20 substituindo os múltiplos de 4 ou de 10 por 'PIM'
    public static void main(String[] args) {
        for(int n = 1; n <= 20; n++){
            // se n for múltiplo de 4 ou n for múltiplo de 10 
            if(n % 4 == 0 || n % 10 == 0){
            // imprimir pim 
            System.out.println("PIM");
            // se não 
            } else {
                System.out.println(n);
            }
            
        }
      
    }
    
}
