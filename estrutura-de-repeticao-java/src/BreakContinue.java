public class BreakContinue {
    public static void main(String[] args) {
       
       // Aplicando um break para for
        for(int numero = 0; numero <= 10; numero++){
            if(numero == 7)
                break;
                
                System.out.println(numero+"\n");
        }
        
        //aplicando um continue para for
        for (int numbers = 20; numbers <= 30; numbers++){
            if(numbers == 25)
                continue;

            System.out.println(numbers);

        }
    }
    
}
