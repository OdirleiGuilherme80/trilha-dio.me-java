public class EstudoForEmArrays {
    public static void main(String []args){
        String alunos[] = {"Odirlei","Maria Alice", "Regina", "Isaac"};
        String frutas[] = {"Mamão", "Melão", "Maça", "Mexerica", "Goiaba"};
        
        //bloco alunos
        for (int x = 0; x < alunos.length; x++) {
            System.out.println(" O aluno no indice x = " + x + " é " + alunos [x]);

        }
        //bloco frutas
        
        for (int y = 0; y < frutas.length; y++){
            System.out.println("As furtas no indice y são: " + y + " é " + frutas[y] );
        }


    }
    
}
