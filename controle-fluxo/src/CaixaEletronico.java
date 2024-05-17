import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        //Saldo disponível
        double saldo = 500.00;
        
        //objeto import Scanner e Locale
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //informação ao usuário
        System.out.println("Por favor digite o valor de retirada: ");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo){
            double saldoRestante = (saldo - valorSolicitado);
        
            System.out.println("Valor solicitado para retirada: " + valorSolicitado);
            System.out.println("saldo disponível em conta é de: " + saldoRestante);

        }else 
            System.out.println("Saldo insuficiente");
    }
}
