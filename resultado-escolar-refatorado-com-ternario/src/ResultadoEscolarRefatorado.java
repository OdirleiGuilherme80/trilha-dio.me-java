import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolarRefatorado {
     public static void main(String[] args) throws Exception {
       double notaAporvacao = 7.0;
       Scanner nota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira a média final do aluno: ");
        double media = nota.nextDouble();

        String resultado = media >= 7.0 ? "Parabéns você esta aprovado, boas férias!" : media >= 5.0 &&  media < 7.0 ? "Você encontra-se em recuperação" : "Infelizmente você tá reporvado";

        System.err.println(resultado);
    
}

}