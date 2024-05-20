public class EstudoForEach {

    //forma mais prática de chammar dados de um array
    public static void main(String[] args) {
        String carros [] = {"Corsa", "Celta", "Onix", "Duster", "Corolla", "Cerato", "BMW", };
        for(String carro : carros){
            System.out.println("Nome de carros são: " + carro);
        }
    }
}
