public class PlanoCelular {
    public static void main(String[] args) {
        // aplicando técnica de controle de fluxo Switch case
        String plano = "M";

        switch(plano){
            case "B":{
                System.out.println("Plano Básico: 100 minutos de ligação + SMS liberado");
                break;
            }
            case "M":{
                System.out.println("Plano Médio: 100 minutos de ligação + Whats' App e Facebook liberado");
                break;
            }
            case"T":{
                System.out.println("Plano TOP: 100 minutos de ligação + Whats'App, Facebook, Instagram, Tik Tok grátis");
                break;
            }
            default:
                System.out.println("Volte a escolher quando quiser.");
        }
        
    }
}
