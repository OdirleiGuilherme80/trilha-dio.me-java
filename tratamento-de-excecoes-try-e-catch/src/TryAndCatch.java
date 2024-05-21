import java.util.Scanner;
import java.util.Locale;

public class TryAndCatch {
    public static void main(String[] args) throws Exception {
        /*aproveitaremos o file AboutMe para aplicarmos o tratamento de exceções com Try, Catch e Finally.
        O tratamento de exceções tem como finalidade tratar erro quando se é encontrado, 
        exemplo nesse arquivo temos a opção de digitar idade e altura, se por acoso ao invéns de colocar 
        números e for digitado letras, usuári será notificado com a maneira correta de ser preecher tal campo de informação.
        */
        try{
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
        
        }  // catch para o erro de exceção ao digitar errado idade e altura//
        catch (java.util.InputMismatchException e) {
            System.err.println("O preenchimento em Idade e Altura, devem conter apenas números e não utilize vírgula em Altura somente ponto");
        }
        
    }
    
}


