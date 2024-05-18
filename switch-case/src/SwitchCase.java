public class SwitchCase {
    public static void main(String[] args) throws Exception {
        String sigla = "O";
        switch (sigla) {
            case "P":{
                System.out.println("Paulo");
                break;
            }

            case "O":{
                System.out.println("Odirlei");
                break;
            }

            case "R":{
                System.out.println("Rodrigo, vulgo pé de pano");
                break;
            }
            case "M":{
                System.out.println("Marcela");
                break;
            }
            default:
                System.out.println("INDEFINIDO!");
        }
    }
}
