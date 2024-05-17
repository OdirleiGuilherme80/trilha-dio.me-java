public class AboutMe {
    public static void main(String[] args) throws Exception {
        String name = args[0];
        String lastname = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);
        
        //Funcinando jogar os argumentos no cmd ou prompt para testar.

        
        System.out.println("Olá me chamo " + name +" "+ lastname);
        System.out.println("tenho " + age + " anos");
        System.out.println("Minha altura é " + height + "cm ");
    }
}
