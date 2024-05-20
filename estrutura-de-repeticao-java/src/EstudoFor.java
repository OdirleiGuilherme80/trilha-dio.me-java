public class EstudoFor {
    public static void main(String[] args) throws Exception {
       //estrutura do controle de fluxo for
       /*for (bloco de declaração; expressão booleana de validação;bloco de icrementação;)
        *comando que será executado até que a 
        *expresssão de validação torne-se falasa
        */
        for (int carneirinhos = 0; carneirinhos <=20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
            System.out.println("Depois de 20 Carneirinhos, Maria Alice dormiu!");
    }

}