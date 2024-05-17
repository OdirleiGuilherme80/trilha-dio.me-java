import java.util.Scanner;
import java.util.Locale;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
       double notaAporvacao = 7.0;
       Scanner nota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira a média final do aluno: ");
        double media = nota.nextDouble();

        if(media > notaAporvacao){
            System.out.println("Parabéns você esta aprovado, boas férias! retorno das aulas dia 10/01/2025");

            } else if ( media >= 5.0 &&  media < 7.0){
            System.out.println("Ops, você encontra-se em recuperação, sua prova será dia 24/05/2024, estude!"); 
                
            } else 
            System.out.println("Infelizmente você tá reporvado");
                            
        }
    }

