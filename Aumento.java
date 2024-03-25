public class Aumento {
    public static void main(String[] args) {
        double salario = 1000;
        double porcentagemdeaumento = 1.5;
        double aumento;
        for(int ano = 2006; ano <=2024; ano++){
            aumento = salario * (porcentagemdeaumento / 100);
            salario += aumento;
            System.out.println(" Ano: " + ano + " % aumento: " + porcentagemdeaumento + " aumento: " + aumento + " salário:  " + salario);
            porcentagemdeaumento *= 2; 
        }
        
    }
    
}
