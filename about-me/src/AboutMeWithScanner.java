import java.util.Scanner;
import java.util.Locale;

public class AboutMeWithScanner {
    public static void main(String[] args) throws Exception {
                
        //criando um objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo dados do usuário 

        System.out.println("Olá me chamo " + nome +" "+ sobrenome);

        System.out.println("tenho " + idade + " anos");

        System.out.println("Minha altura é " + altura + "cm ");
    }
    
}
