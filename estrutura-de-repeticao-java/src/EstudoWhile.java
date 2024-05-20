import java.util.concurrent.ThreadLocalRandom; // gera números aleatórios.
public class EstudoWhile {
    public static void main(String[] args) {
        double mesada = 75.0;
        while (mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce >= mesada)
                valorDoce = mesada;

            System.out.println("Valor do doce: " + valorDoce + "Adicionado ao carrinho de compras");
            mesada = mesada - valorDoce;
        }
         System.out.println("Mesada: " + mesada);
         System.out.println("Maria Alice gastou toda a sua mesada em doces");

    }
        // private tem a função de gerar valores aleatorios para o exemplo.
        //para isso temos que gerar o import java.util dele. 
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(1, 5);
        }
 }

