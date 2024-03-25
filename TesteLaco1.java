import java.util.Scanner;

public class TesteLaco1 {
    public static void main(String[] args) {
        System.out.println("Digite continue para continuar ou qualquer coisa para parar");
        Scanner sc = new Scanner(System.in);
        String opção = sc.nextLine();
        while(opção.equals("continuar")){
            System.out.println("para ou continuar?");
            opção = sc.nextLine();

        }
        sc.close();
    }
    
}
